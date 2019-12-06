package com.slk.training.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P01_UsingLists {
 public static void main(String[] args ){
	 List<String> names = new LinkedList<String>();
	 names.add("sanjana");
	 names.add("sanjana");
	 names.add("vaish");
	 names.add("vinod");
	 System.out.println(names);
	 
	 names.remove("vinod");
	 System.out.println("names aftr removing" +names);
	 names.remove(1);
	 System.out.println("after removing" +names);
	 names.add(0, "dolly");
	 System.out.println("adding" +names);
	 names.set(1, "kumar");
	 System.out.println("after set" +names);
	 
 }
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void test1(String[] args) {
		List objects = new ArrayList();
		objects.add(123);
		objects.add("vinod");
		objects.add(12.45);
		
		System.out.println(objects);
		for (Object obj : objects) {
			System.out.println(obj + " is of type " + obj.getClass());
		}
	}

}
