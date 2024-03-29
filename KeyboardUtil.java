package com.slk.assignment22.utils;

import java.util.Date;
import java.util.Scanner;

@SuppressWarnings("resource")
public final class KeyboardUtil {

	private KeyboardUtil() {
	}

	public static String getString(String message) {
		System.out.print(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static int getInt(String message) {
		System.out.print(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static double getDouble(String message) {
		System.out.print(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}

	public static Date getDate(String message) {
		return DateUtil.toDate(getString(message));
	}

}