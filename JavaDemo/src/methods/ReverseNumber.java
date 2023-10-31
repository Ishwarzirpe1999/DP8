//reverse number
package methods;

import java.util.Scanner;

public class ReverseNumber {
	public int reversenumber(int num)
	{
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		ReverseNumber obj=new ReverseNumber();
		int result=obj.reversenumber(num);
		System.out.println(result);
		
	}

}
