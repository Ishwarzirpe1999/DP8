package oops;

public class Multiply {
	public void mul(int a, int b) {
		System.out.println("this is in int");
		System.out.println(a * b);
	}

	public void mul(double a, double b) {
		System.out.println("this is in double");
		System.out.println(a * b);
	}

	public void mul(float a, float b) {
		System.out.println("this is in float");
		System.out.println(a * b);
	}

	public void mul(short a, short b) {
		System.out.println("this is in short");
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply obj = new Multiply();
		obj.mul(10, 20);
		obj.mul(10.0f, 20.0f);
		obj.mul(10.00, 20.00);
		obj.mul(10, 20);
	}

}
