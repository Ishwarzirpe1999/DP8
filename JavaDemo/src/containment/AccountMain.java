package containment;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array of account object
		Account1 accArr[] = new Account1[3];
		accArr[0] = new Account1(101, "Rohit", 80000);
		accArr[1] = new Account1(102, "Ishwar", 50000);
		accArr[2] = new Account1(103, "moun", 90000);
		for (int i = 0; i < accArr.length; i++) {
			System.out.println(accArr[i]);
		}
		System.out.println();
		System.out.println();

		// or

		for (Account1 a : accArr)
			System.out.println(a);

		double max = 0;
		String name = " ";
		for (Account1 a1 : accArr) {
			if (a1.getBalance() > max) {
				max = a1.getBalance();
				name = a1.getAccName();
			}
		}
		System.out.println(name + " is having maximum balancr rs " + max);
	}

}
