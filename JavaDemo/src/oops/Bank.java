package oops;

public class Bank {
	String bankName;
	String Ifsc;
	String addr;
	Account1 acc;

	public Bank() {
		bankName = " ";
		Ifsc = " ";
		addr = " ";
		acc = new Account1();

	}

	public Bank(String name, String Ifsc, String addrr, Account1 acc) {
		this.bankName = name;
		this.Ifsc = Ifsc;
		this.addr = addrr;
		this.acc = acc;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfsc() {
		return Ifsc;
	}

	public void setIfsc(String ifsc) {
		Ifsc = ifsc;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Account1 getAcc() {
		return acc;
	}

	public void setAcc(Account1 acc) {
		this.acc = acc;
	}

	public String toString() {
		return "Bank name " + bankName + " IFSC code is " + Ifsc + " Address is " + addr + " Account details are" + acc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank a = new Bank();
		System.out.println(a);
		Account1 b = new Account1(2, "Prashant", 025412.54);
		Bank c = new Bank("SBI", "154HG5", "pune", b);
		System.out.println(c);
		System.out.println("___________________");
		System.out.println(b);

	}

}
