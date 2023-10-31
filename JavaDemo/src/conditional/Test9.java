//Write a Java program to input any character and
//check whether it is alphabet, digit or special character 
package conditional;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		s=sc.next().charAt(0);
		
		if((s>='a'||s<='z') && (s>='A'||s<='Z'))
		{
			System.out.println("It is a alphabet");
		}
		else if(s>='0' || s<='9')
		{
			System.out.println("It is a digit");
		}
		else
		{
			System.out.println("It is a special Character");
		}
	}

}
