package com.slk.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.slk.training.entity.Product;

@Repository
public class ProductDaoJdbcTemplateImpl implements ProductDao {

	@Autowired(required = false)
	private JdbcTemplate template;

	private Product toProduct(ResultSet rs) throws SQLException {
		Product p = new Product();
		p.setId(rs.getInt("id"));
		p.setName(rs.getString("name"));
		p.setCategory(rs.getString("category"));
		p.setPrice(rs.getDouble("price"));
		return p;

	}
	
	
	static class ProductRowMapper implements RowMapper<Product> {

		@Override
		public Product mapRow(ResultSet rs, int arg1) throws SQLException {
			Product p = new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setCategory(rs.getString("category"));
			p.setPrice(rs.getDouble("price"));
			return p;
		}

	}
	

	@Override
	public void addProduct(Product p) throws DaoException {
		try {
			String sql = "insert into products(id,name,price,category) values(?,?,?,?)";
			template.update(sql, p.getId(), p.getName(), p.getPrice(), p.getCategory());
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}

	}

	@Override
	public Product getProduct(int id) throws DaoException {
		try {
			String sql = "select *from products where id=?";
			return template.queryForObject(sql, (rs, index) -> toProduct(rs), id);
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public void updateProduct(Product product) throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(int id) throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public int count() throws DaoException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> getAllProducts() throws DaoException {
		List<Product> list = template.query("select *from products", new ProductRowMapper());
		System.out.println("all products:");	
		return list;
	}

	@Override
	public List<Product> getProductsByPriceRange(double min, double max) throws DaoException {
		try {
			String sql = "select * from products where price between ? and ?";
			return template.query(sql, (rs, index) -> toProduct(rs), min, max);
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Product> getProductByCategory(String category) throws DaoException {
		try {
			String sql = "select * from products where category=?";
			return template.query(sql, (rs, index) -> toProduct(rs), category);
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}
	}

}
