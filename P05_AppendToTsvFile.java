package com.slk.training.programs;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.slk.training.util.KeyBoardUtil;

public class P05_AppendToTsvFile {

	public static void main(String[] args) {

		String filename = "people.csv";

		try (
			FileWriter writer = new FileWriter(filename,true); 
			PrintWriter in = new PrintWriter(writer);
			) {
			int id = KeyBoardUtil.getInt("enter id : ");
			String name= KeyBoardUtil.getString("enter name :");
			String email= KeyBoardUtil.getString("enter email :");
			String city= KeyBoardUtil.getString("enter city :");
			System.out.printf("\n%d\t%s\t%s\t%s",id,name,email,city);
		}

		catch (Exception ex) {

		}
		System.out.println("data append to the file ");

	}

}
