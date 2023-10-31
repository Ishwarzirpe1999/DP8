package oops;

//find the net sal by using basic sal.
public class Netsalary {
	int eid;
	String ename, email;
	double basicsal, pf, hra, da, netsal;

	public void setData(int id, String name, String mail, double basic) {
		eid = id;
		ename = name;
		email = mail;
		basicsal = basic;
	}

	public void findPf() {
		pf = basicsal * 0.10;
	}

	public void findHra() {
		hra = basicsal * 0.15;
	}

	public void findDa() {
		da = basicsal * 0.20;
	}

	public void findNetsal() {
		netsal = basicsal - (pf + da + hra);
	}

	public void display() {
		System.out.println("employee id is " + eid);
		System.out.println("employee name is " + ename);
		System.out.println("employee email is " + email);
		System.out.println("employee basic salary is " + basicsal);
		System.out.println("employee pf is " + pf);
		System.out.println("employee da is " + da);
		System.out.println("employee hra is " + hra);
		System.out.println("employee netsalary is " + netsal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Netsalary obj = new Netsalary();
		obj.setData(1, "Ishwar", "ishwar@gmail.com", 2545.352);
		obj.findPf();
		obj.findDa();
		obj.findHra();
		obj.findNetsal();
		obj.display();

	}

}
