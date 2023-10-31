package methods;

import java.util.Scanner;

//5 9 17 29 45 65....
public class Series2 {
	public void series(int num)
	{
		int a=5;
		int temp=a;
		
		int b=9;
		System.out.println(a);
		//System.out.println(b);
		for (int i=1;i<=num;i++)
		{
			int j=4*i;
			
			temp=a+j;
			a=temp;
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want the stop the series");
		int num=sc.nextInt();
		Series2 obj=new Series2();
		obj.series(num);
	}

}
