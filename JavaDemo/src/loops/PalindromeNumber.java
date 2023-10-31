//Palindrome Number eg. 121 and the reverse of 121 is 121 this is called palindrome no.
package loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		int rev=0;
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println(rev);
		if(temp==rev) 
		{
		System.out.println("It is Palindrome");
		}
		else
		{
		System.out.println("It is not Palindrome");
	}
	}

}
