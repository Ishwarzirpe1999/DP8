//By using do-while simple calculator
package loops;

import java.util.Scanner;

public class DoWhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first num1");
		int num1;
		num1=sc.nextInt();
		
		System.out.println("Enter the second num2");
		int num2;
		num2=sc.nextInt();
		
	    char ch;
	    do {
	    	System.out.println("1.Addition\n2.Substraction\n3.multi\n4.Division");
	    	System.out.println("Enter the choice from the menu");
	    	int choice=sc.nextInt();
	    	
	    	switch(choice)
	    	{
	    	case 1:System.out.println("Addition="+(num1+num2));
	    	break;
	    	case 2:System.out.println("Substraction="+(num1-num2));
	    	break;
	    	case 3:System.out.println("Multiplication="+(num1*num2));
	    	break;
	    	case 4:System.out.println("Division="+(num1/num2));
	    	break;
	    	default:System.out.println("Invalid Choice");
	    	}
	    	System.out.println("Do you want to continue...");
	    	ch=sc.next().charAt(0);
	    }
	    while(ch=='y'||ch=='Y');
	}

}
