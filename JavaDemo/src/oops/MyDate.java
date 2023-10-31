package oops;

//
public class MyDate {
	int dd, mm, yy;

	public MyDate() {
		System.out.println("This is the default constuctor");
		dd = 23;
		mm = 5;
		yy = 2032;
	}

	public MyDate(int d, int m, int y) {
		System.out.println("I am in parameterized constructor");
		dd = d;
		mm = m;
		yy = y;
	}

	public void setDd(int d) {
		dd = d;

	}

	public void setMn(int m) {
		mm = m;
	}

	public void setYy(int y) {
		yy = y;
	}

	public int getDd() {
		return dd;
	}

	public int getMm() {
		return mm;
	}

	public int getYy() {
		return yy;
	}

	public void printDate() {
		System.out.println("Date is " + dd + "/" + mm + "/" + yy);
	}
	public void add(MyDate o1)
	{
		int f=this.dd+o1.dd;
		System.out.println(f);
	}
	public MyDate getObject()
	{
		this.dd=20;
		this.mm=10;
		this.yy=2023;
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate obj = new MyDate(22,4,2023);
		obj.setDd(12);
		obj.setMn(3);
		obj.setYy(2024);
		obj.printDate();

		obj.getDd();
		obj.getYy();

		MyDate obj1 = new MyDate(25, 4, 2023);
//		obj1.printDate();
//		obj1.dd = 89;
		obj.add(obj1);//addition of two object.
		
		MyDate o=obj.getObject();
		o.printDate();
	}

}
