
public class Exam04 {
	public static void doSomething(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.print("(" + s.charAt(i) + ")");
			if (i + 1 < s.length())
				System.out.print(" ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		String[] a = { "hello", "world", "hello world" };
		for (String s : a)
			doSomething(s);
	}
}
