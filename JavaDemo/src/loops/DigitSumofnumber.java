//find the digit sum of number
package loops;

import java.util.Scanner;

public class DigitSumofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum =sum+rem;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
