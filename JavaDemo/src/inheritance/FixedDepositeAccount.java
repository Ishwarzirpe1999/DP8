package inheritance;

public class FixedDepositeAccount {
	int Accno;
	String AccName;
	double balance;

	public FixedDepositeAccount() {
		Accno = 0;
		AccName = " ";
		balance = 0;
	}

	public FixedDepositeAccount(int Accno, String AccName, double bal) {
		this.Accno = Accno;
		this.AccName = AccName;
		this.balance = bal;

	}

	public int getAccno() {
		return Accno;
	}

	public void setAccno(int accno) {
		Accno = accno;
	}

	public String getAccName() {
		return AccName;
	}

	public void setAccName(String accName) {
		AccName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "FixedDepositeAccount [Accno=" + Accno + ", AccName=" + AccName + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
