package com.slk.training.programs;

import java.io.BufferedReader;
import java.io.FileReader;

public class P02_ReadFromTextFile {

	static String filename = "src/com/slk/training/programs/P02_ReadFromTextFile.java";

	public static void main(String[] args) throws Exception {
		try (FileReader file = new FileReader(filename); BufferedReader in = new BufferedReader(file);) {
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void ex01(String[] args) throws Exception {
		FileReader in = new FileReader(filename);
		int ch;
		while ((ch = in.read()) != -1) {
			System.out.println((char) ch);
		}
		System.out.println();
		in.close();
	}
}
