//Table of number
package methods;

import java.util.Scanner;

public class TableofNo {
	public void table(int num)
	{
		int table;
		for(int i=1;i<=10;i++)
		{
			table=num*i;
			System.out.println(table);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number that you want the table");
		int num=sc.nextInt();
		TableofNo obj=new TableofNo();
		obj.table(num);
		
	}

}
