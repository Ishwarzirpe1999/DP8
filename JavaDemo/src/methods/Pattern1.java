package methods;

import java.util.Scanner;

//
public class Pattern1 {
	public void pattern(int num) {
		
		for(int i=0;i<=num;i++)
		{	int ch=65;
			for(int j=0;j<=i;j++)
			{
				int s=ch+j;
				System.out.print((char)(ch+j));
				
			}
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want the stop the series");
		int num=sc.nextInt();
		Pattern1 obj=new Pattern1();
		obj.pattern(num);
	}

}
