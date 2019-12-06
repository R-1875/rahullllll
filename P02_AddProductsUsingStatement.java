package com.slk.training.programs;

import java.sql.Connection;
import java.sql.Statement;

import com.slk.training.util.KeyBoardUtil;
import com.slk.training.utils.DbUtil;

public class P02_AddProductsUsingStatement {
	public static void main(String[] args) {
		int id;
		String name, category;
		double price;
		try (Connection conn = DbUtil.newConnection(); Statement stmt = conn.createStatement();) {
			while (true) {
				id = KeyBoardUtil.getInt("enter id");
				name = KeyBoardUtil.getString("enter name");
				category = KeyBoardUtil.getString("enter catagory");
				price = KeyBoardUtil.getDouble("enter price");
				String sql = String.format("insert into products values (%d,'%s','%s',%f)", id, name, category, price);
				stmt.executeUpdate(sql);
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
