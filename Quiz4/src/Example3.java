import java.util.Arrays;

public class Example3 {
	static void solution(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length;) {
			if (a[i] % 2 == 0 || a[i] % 3 == 0) {
				count++;
				for (int j = i; j < a.length - count; j++) {
					a[j] = a[j + 1];
				}
				a[a.length - count] = -1;
			}
			else
				i++;
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7 };
		System.out.println(Arrays.toString(a));
		solution(a);
		System.out.println(Arrays.toString(a));
	}
}
