package methods;
//1 3 7 15 31 63....

import java.util.Scanner;

public class Series {
	public void series(int num)
	{
		int a=0;
		
		for(int i=1;i<=num;i++)
		{
			a=(a*2)+1;
			System.out.println(a);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number when the series you want");
		int num=sc.nextInt();
		Series obj=new Series();
		obj.series(num);
		
	}

}
