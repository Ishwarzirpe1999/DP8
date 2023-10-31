//Write a Java program to count number of digits in any number.
package loops;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		int count=0;
		
		while(num!=0) {
			count++;
			num=num/10;
		}
		System.out.println(count);
		
	
	}
}
