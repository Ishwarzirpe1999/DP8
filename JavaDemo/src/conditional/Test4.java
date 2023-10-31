//write the code to check the given number is divisible by 3 or 9
package conditional;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		 if (num%3==0 && num%9==0)
		{
			System.out.println("It is divisible by 3 and 9");  
		}
		 else if(num%3==0)
		{
			System.out.println("It is divisible by 3");
		}
		else if (num%9==0) {
			System.out.println("It is divisible by 9");
		}
		else {
			System.out.println("It is not divisible by 3 or 9");
		}
		

	}

}
