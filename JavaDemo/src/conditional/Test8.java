//Write a Java program to find maximum between three numbers 
package conditional;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1");
		num1=sc.nextInt();
		
		System.out.println("Enter the num2");
		num2=sc.nextInt();
		
		System.out.println("Enter the num3");
		num3=sc.nextInt();
		
		if(num1 >= num2 && num1>=num3)
		{
			System.out.println("Greast number is "+num1);
		}
		else if(num2 >= num1 && num2 >= num3)
		{
			System.out.println("Greast number is "+num2);
		}
		else
		{
			System.out.println("Greast number is "+num3);
		}
	}

}
