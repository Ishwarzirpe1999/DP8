package methods;
//1 22 333 4444 55555...
import java.util.Scanner;

public class Series1 {
	public void series(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
//				
				System.out.print(i);
				
			}
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the series up to you want");
		int num=sc.nextInt();
		Series1 obj=new Series1();
		obj.series(num);
	}

}
