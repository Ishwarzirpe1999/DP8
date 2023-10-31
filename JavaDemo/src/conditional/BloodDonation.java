//write a code to check candidate is eligible for blood donation or not for the blood donation weight must be 50kg or more than 50 and age is more than 18.
package conditional;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the candidate weight");
		weight=sc.nextInt();
		System.out.println("Enter the candidate age");
		age = sc.nextInt();
		
		if(weight>=50 && age>18)
		{
			System.out.println("Candidate is eligible for the blood donation");
		}
		else {
			System.out.println("Candidate is not eligible for the blood donation");
		}
	}

}
