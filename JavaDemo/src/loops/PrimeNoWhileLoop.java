
//check prime no by using while loop
package loops;

import java.util.Scanner;

public class PrimeNoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		int i=2;
		int count=0;
		
		while(i<num)
		{
			if(num%i==0)
			{
				count =1;
				break;
			}
			i++;
		}
		if(count==0)
		{
			System.out.println("It is prime");
		}
		else {
			System.out.println("It is not prime");
		}
	}

}
