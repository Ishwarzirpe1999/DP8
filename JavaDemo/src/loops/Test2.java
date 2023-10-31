//create the basic calculator from the user and take the values from the user two operands and 
//and do the task by using string.
package loops;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the Second number");
		int num2=sc.nextInt();
		String ch = null;
		
	do {
		
		System.out.println("Enter your choice (Addition,Substraction,Multiplication,Division");
		String calculate;
		calculate=sc.next();
		
		
			
		switch(calculate)
    	{
    	case "Addition":System.out.println("Addition="+(num1+num2));
    	break;
    	case "Substraction":System.out.println("Substraction="+(num1-num2));
    	break;
    	case "Multiplication":System.out.println("Multiplication="+(num1*num2));
    	break;
    	case "Division":System.out.println("Division="+(num1/num2));
    	break;
    	default:System.out.println("Invalid Choice");
    	}
		System.out.println("Do you want to continue...");
	}
	while(ch=="Yes"||ch=="yes");

	}
}

