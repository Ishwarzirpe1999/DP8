package array;

import java.util.Scanner;

public class SumOfArray {
	public static void showElement(int num[]) {
		System.out.println("Array Elements are...");
		for (int e : num)
			System.out.println(e + " ");
	}

	public static int[] createArray() {
		int num[];
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];

		for (int i = 0; i < num.length; i++) {
			System.out.println("Please Enter the element");
			num[i] = sc.nextInt();
		}
		sc.close();
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 5, 6, 7, 8, 9 };
		showElement(arr);
		int n[] = createArray();
		showElement(n);
	}

}
