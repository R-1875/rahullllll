package com.slk.assignments.programs;

import java.util.Scanner;

public class Assignment18 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("number of inputs");
		int n = s.nextInt();
		
		System.out.println("number of integer inputs");
		int d = s.nextInt();
		
		System.out.println("number of non-integer inputs  "+(n-d));		
		
		System.out.println("enter integers");
		int[] ch = new int[d];
		for(int i=0;i<d;i++){
		ch[i]= s.nextInt();
		}
		//System.out.println("integers are : ");
		//for(int i=0;i<d;i++){
		//System.out.println(ch[i]);
		//}
		int sum=0;
		for(int i=0;i<d;i++){
		 sum = sum+ch[i];
		 
			}
		System.out.println("sum of intergers"+sum);
		System.out.println("non-integer intputs are ");
		String[] f = new String[n-d];
		for(int i=0;i<(n-d);i++){
			f[i]=s.nextLine();
		}
	}

}
