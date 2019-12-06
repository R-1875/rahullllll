package com.slk.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.slk.training.entity.Product;

public class ProductManager {

	private Connection openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		String url = "jdbc:h2:tcp://localhost/~/slk_training_2018_12";
		String user = "sa";
		String password = "";
		return DriverManager.getConnection(url, user, password);

	}

	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<>();
		try (Connection conn = openConnection();
				PreparedStatement stmt = conn.prepareStatement("select * from PRODUCTS");
				ResultSet rs = stmt.executeQuery();) {
			while (rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setCategory(rs.getString("Category"));
				p.setPrice(rs.getDouble("price"));
				list.add(p);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

	public void addNewProduct(Product p) {
String sql ="insert into products values(?,?,?,?)";
try(
		Connection conn = openConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);
		){
	stmt.setInt(1, p.getId());
	stmt.setString(2, p.getName());
	stmt.setString(3, p.getCategory());
	stmt.setDouble(4, p.getPrice());
	stmt.executeUpdate();
}
catch(Exception ex){
	ex.printStackTrace();
}
	}
}
