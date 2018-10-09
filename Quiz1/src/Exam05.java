
public class Exam05 {

	public static void doSomething(int i) {
		System.out.printf("%05d\n",i);
	}

	public static void main(String[] args) {
		int[] a = { 2, 34, 256, 1980 };
		for (int i : a)
			doSomething(i);
	}

}
