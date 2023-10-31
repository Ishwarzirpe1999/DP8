package methods;

import java.util.Scanner;

//input is 832 then output is 594
//input is 51 then output is 36
//input is 7977 then output is 180
//input is 149 then output is 0
public class Test {
	public void reverse(int num)
	{
		int rev=0;
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		int result=temp-rev;
		if(result<0)
			System.out.println("0");
		else
			System.out.println(result);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Test obj=new Test();
		obj.reverse(num);
	}

}
