package e2018.exam2;

import java.util.Arrays;

public class Exam15 {
	static void sort(int[] a) {
		Arrays.sort(a);
	}

	static int[] insert(int[] a, int value) {
		if (Arrays.binarySearch(a, value) >= 0) {
			return a;
		} else {
			int[] b = Arrays.copyOf(a, a.length + 1);
			Arrays.fill(b, b.length - 1, b.length, value);
			Arrays.sort(b);
			return b;
		}
	}

	public static void main(String[] args) {
		int[] a = { 3, 8, 1, 2, 4, 5, 7 };
		sort(a);
		System.out.println(Arrays.toString(a));
		a = insert(a, 2);
		a = insert(a, 6);
		System.out.println(Arrays.toString(a));
	}
}