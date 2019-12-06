package com.slk.training.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P01_AddNewProduct {

	public static void main(String[] args) throws Exception {
		String driver = "org.h2.Driver";
		String url = "jdbc:h2:tcp://localhost/~/slk_training_2018_12";
		String username = "sa";
		String password = "";
		Class.forName(driver) ;
		Connection conn = DriverManager.getConnection(url, username , password);
		//System.out.println("got a connection of type: " +conn.getClass());
		String sql = "insert into products values (5,'sony 40 inch led tv','television',56000)";
		Statement stmt = conn.createStatement();
		stmt.execute(sql);
		stmt.close();
		conn.close();
		System.out.println("data inserted succesfully");
	}
}

