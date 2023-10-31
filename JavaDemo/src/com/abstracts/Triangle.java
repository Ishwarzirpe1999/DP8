package com.abstracts;

//1/2*Base*Height
public class Triangle extends Shape {
	static double base=21;
	static double height=10;
	Triangle ob;

//	public Triangle(double b, double h) {
//		this.base = b;
//		this.height = h;
//	}

	@Override
	public double calculateArea() {
		double area = 1 / 2 * base * height;
		return area;
		
	}
	public static void main(String[] args) {
		Triangle obj=new Triangle();
		System.out.println(obj.calculateArea());
	}
	
	

	
	
	

}
