package methods;

public class CalculatorBymethod {
	public static int Addition(int a,int b) {
		int ans=a+b;
		return ans;
	}
	public static int Substraction(int a,int b) {
		int ans=a-b;
		return ans;
	}
	public static int Multiplication(int a,int b) {
		int ans=a*b;
		return ans;
	}
	public static int Division(int a,int b) {
		int ans=a/b;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorBymethod obj =new CalculatorBymethod();
		int res=obj.Addition(12, 14);
		System.out.println(res);
	}

}
