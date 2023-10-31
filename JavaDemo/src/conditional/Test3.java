//take the number between 1 to 5 from user and as per the number display number in word
package conditional;

import java.util.Scanner;

public class Test3 {
  public static void main(String args[])
  {
	  int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		num = sc.nextInt();
		if(num==1)
		{
			System.out.println("It is One");
		}
		else if(num==5)
		{
			System.out.println("It is five");
		}
		
		else if(num==2)
		{
			System.out.println("It is Two");
		}
		else if(num==3)
		{
			System.out.println("It is Three");
		}
		else if(num==4)
		{
			System.out.println("It is Four");
		}
		else
		{
			System.out.println("invalid number");
		}
		
  }
}
