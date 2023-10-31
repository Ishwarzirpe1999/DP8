package methods;

//prime no series
public class Primenoseries {
	public void primenumber(int num) {
		for (int i = 2; i <= num; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
//				
				if (i % j == 0)

					count = 1;
			}
			if (count == 0)

				System.out.println(i);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenoseries obj = new Primenoseries();
		obj.primenumber(50);
	}

}
