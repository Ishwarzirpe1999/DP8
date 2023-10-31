//Write code to perform menu driven program using do-while and switch to calculate area of rectange
//circle,triangle,and square as per the choice.
package loops;

import java.util.Scanner;

public class MenuDriverPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int length;
		length=sc.nextInt();
		
		System.out.println("Enter the width");
		int width;  
		width=sc.nextInt();
		
		System.out.println("Enter the base");
		int base=sc.nextInt();
		
		System.out.println("Enter the height");
		int height=sc.nextInt();
		
		System.out.println("Enter the side");
		int side=sc.nextInt();
		
		System.out.println("Enter the radius");
		int radius=sc.nextInt();
		
	    char ch =0;
	    do {
	    	System.out.println("1.Area of rectangle\n2.Area of square\n3.Area of Circle\n4.Area of Triangle");
	    	System.out.println("Enter the choice from the menu");
	    	int choice=sc.nextInt();
	    	
	    	switch(choice)
	    	{
	    	case 1:System.out.println("Area of rectangel="+(length*width));
	    	break;
	    	case 2:System.out.println("Area of square="+(side*side));
	    	break;
	    	case 3:System.out.println("Area of circle="+(3.14*radius*radius));
	    	break;
	    	case 4:System.out.println("Area of triangel="+(0.5*base*height));
	    	break;
	    	default:System.out.println("Invalid Choice");
	    	}
	    	System.out.println("Do you want to continue...");
	}
	    while(ch=='y'||ch=='Y');

	}
}
