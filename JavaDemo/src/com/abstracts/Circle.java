package com.abstracts;

public class Circle extends Shape {
	double r;
	final double pi = 3.14;
	Shape arr[];

	public Circle(double r) {
		this.r = r;
	}

	public double calculateArea() {
		return pi * r * r;
	}

	@Override
	public String toString() {
		return "Area" + arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle(3);
		System.out.println(obj.calculateArea());
		System.out.println();
		Shape arr[] = new Shape[4];

		arr[0] = new Circle(10);

		arr[1] = new Triangle();
		arr[2] = new Triangle();

		arr[3] = new Circle(5);

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i].calculateArea());
		}
	}

}
