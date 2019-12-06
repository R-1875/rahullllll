package com.slk.training.programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.slk.training.entity.Employee;

public class P06_SerializationDemo {
	public static void main(String[] args) throws IOException {
		
		Employee[] emps = { 
				new Employee(7788, "smith", 23999),
				new Employee(112, "john", 38000)
						};
		FileOutputStream file = new FileOutputStream("emps.data");
		ObjectOutputStream out = new ObjectOutputStream(file);

		for (Employee e : emps) {
			out.writeObject(e);
		}
		out.close();
		file.close();
		System.out.println("employee data saved to file");
	}
}
