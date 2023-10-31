package containment;

public class BankArrayDemo {
	int branchCode;
	String bankName;
	String address;
	Account1 account[];

	public BankArrayDemo() {

	}

	public BankArrayDemo(int branchCode, String bankName, String address, Account1 account[]) {
		this.branchCode = branchCode;
		this.bankName = bankName;
		this.address = address;
		this.account = account;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account1[] getAccount() {
		return account;
	}

	public void setAccount(Account1[] account) {
		this.account = account;
	}

	public String toString() {
		return "bank [branchCode=" + branchCode + ", bankName=" + bankName + ", address=" + address;
	}

	public void printAccount() {
		for (Account1 a : account)
			System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 accArr[] = new Account1[3];
		accArr[0] = new Account1(101, "Rohit", 80000);
		accArr[1] = new Account1(102, "Ishwar", 50000);
		accArr[2] = new Account1(103, "moun", 90000);

		BankArrayDemo obj = new BankArrayDemo(1001, "Deccan", "pune", accArr);
		System.out.println(obj);
		obj.printAccount();
	}

}
