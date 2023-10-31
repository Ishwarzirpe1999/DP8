package oops;

public class Account {

	private int accNo;
	private String ownerName;
	private double balance;
	static float intrestRate;
	int time;
	float si;
	
	static {
		intrestRate = 0.08f;
	}
	public static void getInterestRate()
	{
		System.out.println(intrestRate);
		
	}
	public void calculateSI()
	{
		si=((float)balance*intrestRate*time)/100;
	}
	public void calculateBal()
	{
		balance=balance*si;
	}
//	public void setAccNo(int no) {
//		accNo = no;
//	}
//
//	public void setOwnerName(String name) {
//		ownerName = name;
//	}
//
//	public void setBalance(double bal) {
//		balance = bal;
//	}
//
//	public int getAccNo() {
//		return accNo;
//	}
//
//	public String getOwnerName() {
//		return ownerName;
//	}
//
//	public double getBalance() {
//		return balance;
//	}

	public void display() {
		System.out.println("Owners Account name is " + ownerName);
		System.out.println("Account number is " + accNo);
		System.out.println("Account balance is " + balance);

	}
    public String toString()
    {
    	return "hi";
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
//		obj.setAccNo(14254);
//		obj.setOwnerName("Ishwar");
//		obj.setBalance(2154145);
//		obj.display();
		Account.getInterestRate();
		System.out.println(obj);
		

	}

}
