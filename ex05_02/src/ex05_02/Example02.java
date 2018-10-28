package ex05_02;

import java.util.Arrays;

public class Example02 {
	static void printSum(int... a) {
		int sum = a[0];
		for (int i = 1; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("배열:" + Arrays.toString(a) + " 합계:" + sum);
	}

	public static void main(String[] args) {
		int[] a = new int[] { 21, 33, 17, 40, 5, 13 };
		printSum(11, 13, 17, 20);
		printSum(a);
	}
}