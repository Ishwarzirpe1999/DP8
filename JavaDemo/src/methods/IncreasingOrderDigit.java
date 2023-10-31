package methods;

//increasing order digit eg.12345,3456,789
public class IncreasingOrderDigit {
	public void increase(int num) {
		int last = num % 10;
		int count = 0;
		int rem;
		while (num != 0) {
			rem = num % 10;
			
			if (rem < last) {
				count++;
				last = rem;
			}
			num = num / 10;
		}
		if (count == 0)

			System.out.println("It is not increasing number");
		else
			System.out.println("It is increasing number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncreasingOrderDigit obj = new IncreasingOrderDigit();
		obj.increase(123789);
	}

}
