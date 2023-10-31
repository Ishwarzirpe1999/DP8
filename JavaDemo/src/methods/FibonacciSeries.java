//Fibonacci Series
package methods;

import java.util.Scanner;

public class FibonacciSeries {
	public void fibonacci(int num)
	{
		int a=0;
		int b=1;
		int c;
		//System.out.println(a);
		//System.out.println(b);
		for(int i=2;i<num;i++)
		{
			c=a+b;
			
			
			if(c%5==0)
			{
				System.out.println(c);
				
			}
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num up to the series you want");
		int num=sc.nextInt();
		FibonacciSeries obj=new FibonacciSeries();
		obj.fibonacci(num);
	}

}
