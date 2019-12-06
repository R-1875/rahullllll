package com.slk.training.programs;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.slk.training.util.KeyBoardUtil;

public class P03_WriteToTextFile {
	public static void main(String[] args) throws Exception {
		String filename = "names.txt";
		FileWriter file = new FileWriter(filename, true);
		PrintWriter out = new PrintWriter(file);
		while (true) {
			String input = KeyBoardUtil.getString("enter a name (or balnk to stop):");
			if (input.trim().equals("")) {
				break;
			}
			out.println(input);
		}

		out.close();
		file.close();
		System.out.println("file" + filename + " is created !! ");
	}

}