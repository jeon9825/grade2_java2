
public class Exam09 {
	static String reverse(String path) {
		/* ������ �κ� */
		StringBuilder builder = new StringBuilder();
		builder.append(path);
		builder.reverse();
		return builder.toString();
	}

	public static void main(String[] args) {
		String[] a = { "hello", "world", "hello world" };
		for (String s : a)
			System.out.println(reverse(s));
	}
}