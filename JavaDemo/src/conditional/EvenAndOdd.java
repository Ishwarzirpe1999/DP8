//Write a Java program to check whether a number is even or odd by using switch case
package conditional;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		even=sc.nextInt();
		switch(even%2) {//we can't allowed boolean,double,float,long.
		case 0:System.out.println("It is even ");
		
		default:System.out.println("It is odd");
		}
	}

}
