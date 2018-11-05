package e2018.exam2;

public class Exam10 {
	static int sum(int[][] a) {
		int sum = 0;
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				sum += a[r][c];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] a = new int[][] { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
		System.out.println(sum(a));
	}
}