package com.slk.training.entity;

public class Square implements Shape{
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public void printArea() {
		double area = side * side;
		System.out.printf("area of square with side %.2f is %.2f \n", side, area);
	}

}
