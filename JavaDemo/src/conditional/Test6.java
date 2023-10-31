//write a java program to check whether a year is leap year or not
package conditional;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the year");
		a=sc.nextInt();
		
		if((a%4==0 && a%100!=0) || a%400==0)
		{
			System.out.println("it is a leap year");
		}
		else {
			System.out.println("It is not a leap year");
		}
		
		
	}

}
