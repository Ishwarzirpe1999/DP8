package inheritance;

class Test1 {
	public void getDetails(String temp) {
		System.out.println("Derived class " + temp);
	}
}

public class Derived extends Test {
	public int getDetails(String temp) {
		System.out.println("Test class " + temp);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived obj = new Derived();
		obj.getDetails("Hello");
	}

}
