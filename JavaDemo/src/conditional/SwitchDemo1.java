package conditional;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		num1= sc.nextInt();
		
		System.out.println("Enter the num2");
		num2= sc.nextInt();
		
		System.out.println("1.add \n2.sub \n3.multi \n4.division");
		System.out.println("Enter your menu");
		int menu=sc.nextInt();
		
		switch(menu)
		{
		case 1:System.out.println("addition ="+(num1+num2));
		break;
		
		case 2:System.out.println("Substraction ="+(num1-num2));
		break;
		
		case 3:System.out.println("Multiplication ="+(num1*num2));
		break;
		
		case 4:System.out.println("Division ="+(num1/num2));
		break;
		
		default:System.out.println("Invalid Choice");
		}
	}

}
