//Technical number.
//eg.3025=30^2+25^2=3025
package methods;

import java.util.Scanner;

public class TechnicalNumber {
	 static public void technical(int num)
	{	int temp=num;
	System.out.println(num);
		int count=0;
		while(num!=0) {
			int rem=num%10;
			count++;
			num=num/10;
		}
		//System.out.println(count);
		int power=1;
		for(int i=1;i<=count/2;i++)
		{
			power= power*10;
		}
		if(count%2==0) 
		{
			int num1=temp/power;
			int num2=temp%power;
			int sum1=num1+num2;
			int square=sum1*sum1;
			if(square==temp)
			{
				System.out.println("Technical number");
			}
			else
			{
				System.out.println(" NotTechnical number");
			}
			
		}
		
		else
		{
			System.out.println(" NotTechnical number");
		}
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner  sc =new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
	//	System.out.println("hi");
		technical(num);
	}	
}
