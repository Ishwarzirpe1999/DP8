package oops;

import java.util.Scanner;

public class ElectricityBill {
	String meterNo, customerId, customerName, customerEmail, month;
	double units, bill, totalbill;

	public void setData(String metNo, String Id, String name, String mail, String mon) {
		meterNo = metNo;
		customerId = Id;
		customerName = name;
		customerEmail = mail;
		month = mon;
	}

	public void calculateBill(double unit) {
		units = unit;
		if (units <= 50) {
			totalbill = (0.5 * units);
			System.out.println("Total bill is " + totalbill);
		} else if (units <= 150) {
			totalbill = (0.5 * 50) + (0.75 * (units - 50));
			System.out.println("Total bill is " + totalbill);
		} else if (units >= 250) {
			totalbill = (0.5 * 50) + (0.75 * 100) + (1.20 * (units - 150)+(1.50*(units-250)));
			System.out.println("Total bill is " + totalbill);
		}
	}

	public void display() {
		System.out.println("Enter meter No " + meterNo);
		System.out.println("Enter customer ID " + customerId);
		System.out.println("Enter customer name " + customerName);
		System.out.println("Enter the customer Email " + customerEmail);
		System.out.println("Enter month " + month);
		System.out.println("Total bill is "+totalbill);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of unit consumed");
		double unit = sc.nextDouble();
		ElectricityBill obj = new ElectricityBill();
		obj.setData("A-23", "12", "Ishwar", "ishwar@gmail.com", "dec");
		obj.calculateBill(unit);
		obj.display();
	}

}
