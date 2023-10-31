package methods;

import java.util.Scanner;

public class Fact {
	public int factorial(int a)
	{
		int fact =1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Fact obj=new Fact();
		
		int result = obj.factorial(num);
		System.out.println(result);
	}

}
