//Find out the table of given number.
package loops;

import java.util.Scanner;

public class TableOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table Number");
		num=sc.nextInt();
		int table;
		for(int i=1;i<=10;i++)
		{
			table=num*i;
			System.out.println(table);
		}
	}

}
