//sum of first and last digit of the number.
package loops;

import java.util.Scanner;

public class SumOfFirstandLastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		int sum=0;
		int rem;
		int count=0;
		while(num!=0)
		{
			rem=num%10;
			count++;
			num=num/10;
	
			if(count==1 || num==0)
			{
				sum =sum+rem;
			}
		}
		System.out.println(sum);		
		
	}

}
