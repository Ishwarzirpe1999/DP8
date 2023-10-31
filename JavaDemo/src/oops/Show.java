package oops;

public class Show {
	public void show(double a, double b) {
		System.out.println("addition of double");
	}

	public void show(float a, float b) {
		System.out.println("addition of float");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Show obj = new Show();
		obj.show(10, 20);
	}

}
