package com.slk.training.util;

import java.util.Scanner;
@SuppressWarnings("resource")
public final class KeyBoardUtil {

	public KeyBoardUtil() {
	}
public static int getInt(String message){
	System.out.println(message);
	Scanner sc=new Scanner(System.in);
	return sc.nextInt();
}
public static double getDouble(String message){
	System.out.println(message);
	Scanner sc=new Scanner(System.in);
	return sc.nextInt();
}
public static String getString(String message){
	System.out.println(message);
	Scanner sc=new Scanner(System.in);
	return sc.nextLine();
}
}
