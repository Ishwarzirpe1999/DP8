//write the code to day number as a input from the user and display its day name as per the input
package conditional;

import java.util.Scanner;

public class DayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day number");
		a=sc.nextInt();
		 
		switch(a) {
		
		case 1:System.out.println("Sunday");
		break;
		
		case 2:System.out.println("Monday");
		break;
		
		case 3:System.out.println("Tuesday");
		break;
		
		case 5:System.out.println("Wednesday");
		break;
		
		case 6:System.out.println("Thursday");
		break;
		
		case 4:System.out.println("Friday");
		break;
		
		case 7:System.out.println("Saturday");
		break;
		
		default:System.out.println("Invalid Number");
		}
	}

}
