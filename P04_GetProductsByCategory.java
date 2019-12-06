package com.slk.training.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.slk.training.util.KeyBoardUtil;
import com.slk.training.utils.DbUtil;

public class P04_GetProductsByCategory {

	public static void main(String[] args) {
		int id;
		String name, category = KeyBoardUtil.getString("enter category: ");
		double price;
		String sql = "select * from products where category=?";
		try (Connection conn = DbUtil.newConnection(); PreparedStatement stmt = conn.prepareStatement(sql);) {
			stmt.setString(1, category);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				do{
					id=rs.getInt(1);
					name=rs.getString("name");
					price=rs.getDouble("price");
					System.out.println("Id    : " +id);
					System.out.println("Name   : " +name);
					System.out.println("price  : " +price);
					System.out.println();
				}while(rs.next());
			}
			else{
				System.out.println("no product found " +category);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
