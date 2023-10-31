package methods;

//Frequency of the number
public class FrequencyOfNumber {

	public void frequency(int num) {
		int result;
		int rem = 0;

		for (int i = 0; i <= 9; i++) {
			int temp = num;
			result = 0;
			while (temp != 0) {
				rem = temp % 10;

				if (i == rem) {
					result++;
				}

				temp = temp / 10;
			}
			if (result > 0)
				System.out.println(i + "=" + result);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequencyOfNumber obj = new FrequencyOfNumber();
		obj.frequency(245135);
	}

}
