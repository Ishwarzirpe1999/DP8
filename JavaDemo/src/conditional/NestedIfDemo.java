package conditional;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int per, year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Percentage");
		per = sc.nextInt();
		System.out.println("Enter the Passout year ");
		
		year = sc.nextInt();
		if(year==2022)
		{
			if(per>60) {
				System.out.println("selected for the interview");
			}
			else
			{
				System.out.println("Not selected for the interview");
			}
		}
		else {
			System.out.println("Not selected for the interview");
		}
		
	}

}
