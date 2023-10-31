//Armstrong number with 3 digit number.
package methods;

import java.util.Scanner;

public class ArmstrongNumber {
	public int digitcount(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public int power(int b, int e) {
		int power = 1;
		for (int i = 0; i < e; i++) {
			power = power * b;
		}
		return power;
	}

	public boolean sum(int num) {
		int cnt = digitcount(num);
		System.out.println("Digit count is" + cnt);
		int temp = num;
		int result, sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + power(rem, cnt);
			System.out.println("power of" + temp + "is" + sum);
			num = num / 10;
		}
		if (sum == temp)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		ArmstrongNumber obj = new ArmstrongNumber();

		if (obj.sum(num)) {
			System.out.println("It is Armstrong Number");
		} else {
			System.out.println("It is Not Armstrong Number");
		}

	}

}
