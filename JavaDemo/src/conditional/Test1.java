package conditional;
	import java.util.Scanner;

	public class Test1 {
		public static void main(String args[])
		{
		
			int num;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the number");
			num=sc.nextInt();
			
			if(num%9==0)
			{
				System.out.println("It is divisible by 9");
				
			}
			else {
				System.out.println("It is not divisible by 9");
			}
			
		}
		

	}


