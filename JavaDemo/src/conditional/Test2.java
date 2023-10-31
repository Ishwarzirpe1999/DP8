package conditional;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		
		if(num<0)
		{
			System.out.println("It is negative number");
		}
		else if(num>0)
		{
			System.out.println("It is a Positive number");
			
		}
		else
		{
			System.out.println("It is a zero");
		}
		
	}

}
