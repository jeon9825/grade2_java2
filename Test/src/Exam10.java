import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam10 {
	public static void remove(String[] a, int index, String s) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(a));
		list.remove(index);
		list.add(s);
		for (int i = 0; i < a.length; ++i)
			a[i] = list.get(i);
	}

	public static void main(String[] args) {
		String[] a = { "a", "b", "b", "c", "d", "d", "e" };
		remove(a, 1, "f");
		remove(a, 3, "g");
		System.out.println(Arrays.toString(a));
	}
}