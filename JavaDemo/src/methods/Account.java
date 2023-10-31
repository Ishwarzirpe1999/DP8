package methods;

import java.util.Scanner;

//
public class Account {

	long ac_number, ifsc_code;
	double balance, depositeAmount, withdrawAmount, amount;
	String ac_name, branch_name;

	public void setData(String acname, String branch, long number, long ifsc, double bal) {
		ac_number = number;
		ifsc_code = ifsc;
		ac_name = acname;
		branch_name = branch;
		balance = bal;
	}

	public void depositeamt(int amount1) {
		depositeAmount = balance + amount1;
	}

	public void withdrawamt(int amount1) {
		withdrawAmount = balance - amount1;
	}

	public void display() {
		System.out.println("Account name is " + ac_name);
		System.out.println("Account number is " + ac_number);
		System.out.println("Account IFSC code is " + ifsc_code);
		System.out.println("Branch name is " +branch_name);
		System.out.println("Account Balance is " + balance);
		System.out.println("Account Balance after deposite amount is " + depositeAmount);
		System.out.println("Account Balance after withdrawamount is " + withdrawAmount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount1 = sc.nextInt();
		Account obj=new Account();
		obj.setData("Ishwar", "pune", 124524455l, 45786l,21546);
		obj.depositeamt(amount1);
		obj.withdrawamt(amount1);
		obj.display();

	}

}
