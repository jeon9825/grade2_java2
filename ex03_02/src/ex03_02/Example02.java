package ex03_02;

public class Example02 {
	static String toString(String[] a) {
		StringBuilder sb = new StringBuilder("{");
		int i = 0;
		while (true) {
			sb.append("\"" + a[i] + "\"");
			i++;
			if (i < a.length) {
				sb.append(", ");
			} else {
				sb.append("}");
				return sb.toString();
			}
		}
	}

	public static void main(String[] args) {
		String[] a = { "one", "two", "three", "four" };
		String s = toString(a);
		System.out.println(s);
	}
}