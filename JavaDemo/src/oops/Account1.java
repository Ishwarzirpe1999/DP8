package oops;

public class Account1 {
	int accNo;
	String accName;
	private double balance;

	Account1() {
		accNo = 0;
		accName = " ";
		balance = 0;

	}

	Account1(int accno, String name, double balance) {
		this.accNo = accno;
		this.accName = name;
		this.balance = balance;
	}

	public void setAccNo(int no) {
		accNo = no;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccName(String name) {
		accName = name;
	}

	public String getAccName() {
		return accName;
	}

	public void setBalance(double bal) {
		balance = bal;
	}

	public double getBalance() {
		return balance;
	}

	public String toString() {
		return "Account no is" + accNo + " name is " + accName + " Balance is " + balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 obj = new Account1();
		obj.setAccName("Ishwar");
		obj.setAccNo(212544);
		obj.setBalance(78895475.478);

		Account1 obj1 = new Account1(1, "jchfhc", 25442.325);
		System.out.println(obj1);
	}

}
