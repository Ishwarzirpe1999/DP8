//take a one char from user and check it is in upper case and lower case 
package loops;

import java.util.Scanner;

public class Test1 {
	public static void main(String args[])
			{
		Scanner sc=new Scanner(System.in );
		char ch;
		
		System.out.println("Enter the character");
		ch=sc.next().charAt(0);
		
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("It is in upper case");
		}
	 else if(ch>='a'&& ch<='z')
		{
			System.out.println("It is in lower case");
		}
		
	 else
	 {
		 System.out.println("It is not a character");
	 }
			}
}
