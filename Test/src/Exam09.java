import java.util.Arrays;

public class Exam09 {
	public static String[] insert(String[] a, int index, String s) {
		String[] str = Arrays.copyOf(a, a.length + 1);
		for (int i = str.length-1; i >index; i--) {
			str[i]=a[i-1];
		}
		str[index]=s;
		return str;
	}

	public static void main(String[] args) {
		String[] a = { "a", "c", "d", "f", "g", "h" };
		a = insert(a, 1, "b");
		a = insert(a, 4, "e");
		System.out.println(Arrays.toString(a));
	}
}