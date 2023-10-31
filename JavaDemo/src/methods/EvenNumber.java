package methods;

public class EvenNumber {

	public static int even(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumber obj = new EvenNumber();
		int res = obj.even(6);
		System.out.println(res);
	}

}
