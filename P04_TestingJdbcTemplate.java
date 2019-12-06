package com.slk.training.programs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.slk.training.cfg.AppConfig5;
import com.slk.training.entity.Product;

public class P04_TestingJdbcTemplate {

	private static JdbcTemplate template;

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

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig5.class);

		template = ctx.getBean(JdbcTemplate.class);
		printProductCount();
		printProductNameForId(1);
		printProductDetailsForId(7);
		increaseProductPriceForId(7, 1000.0);
		printAllProductNamesAndPrices();
		getProductForId(7);
		getAllProducts();
		ctx.close();

	}

	private static void getAllProducts() {
		List<Product> list = template.query("select *from products", new ProductRowMapper());
		System.out.println("all products:");
		for(Product p : list){
			System.out.println(p);
		}
	System.out.println();
		}

	private static void getProductForId(int id) {
		String sql = "select *from products where id = ?";
		ProductRowMapper prm = new ProductRowMapper();
		Product p = template.queryForObject(sql, prm, id);
		System.out.println(p);
	}

	static void increaseProductPriceForId(int id, double incr) {
		String sql = "update products set price = price + ?  where id = ?";
		int uc = template.update(sql, incr, id);
		System.out.printf("%d rows updates \n", uc);
	}

	static void printAllProductNamesAndPrices() {
		String sql = "select name,price from products";
		List<Map<String, Object>> list = template.queryForList(sql);
		for (Map<String, Object> row : list) {
			System.out.printf("%-30s  %10.2f\n", row.get("NAME"), row.get("PRICE"));
		}

	}

	static void printProductDetailsForId(int id) {
		String sql = "select * from products where id = ?";
		Map<String, Object> row = template.queryForMap(sql, id);
		System.out.println("\nproduct details for id " + id);
		System.out.println("name  = " + row.get("NAME"));
		System.out.println("Category =" + row.get("CATEGORY"));
		System.out.println("price = rs. " + row.get("PRICE"));

	}

	private static void printProductNameForId(int id) {
		String sql = "select name from products where id = ?";
		String name = template.queryForObject(sql, String.class, id);
		System.out.printf("\n name (id=%d): %s\n", id, name);

	}

	static void printProductCount() {

		Integer pc = template.queryForObject("select count(*) from products", Integer.class);
		System.out.println("There are " + pc + " products");
	}

}
