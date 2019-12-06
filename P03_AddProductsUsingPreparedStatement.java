package com.slk.training.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.slk.training.util.KeyBoardUtil;
import com.slk.training.utils.DbUtil;

public class P03_AddProductsUsingPreparedStatement {
	public static void main(String[] args) {
		int id;
		String name, category;
		double price;
		String sql = "insert into products values (?,?,?,?)";
		
		try (Connection conn = DbUtil.newConnection(); PreparedStatement stmt = conn.prepareStatement(sql);)
		{
			while (true) {
				id = KeyBoardUtil.getInt("enter id");
				name = KeyBoardUtil.getString("enter name");
				category = KeyBoardUtil.getString("enter catagory");
				price = KeyBoardUtil.getDouble("enter price");
				
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, category);
				stmt.setDouble(4,price);
				
				//String sql = String.format("insert into products values (%d,'%s','%s',%f)", id, name, category, price);
				stmt.executeUpdate();
				System.out.println("data inserted successfully");
				String choice = KeyBoardUtil.getString("do you want to add another product? yes/no");
				if (choice.equalsIgnoreCase("no")) {
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
