import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam08 {
	public static void insert(String[] a, int index, String s) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(a));
		list.add(index, s);
		for (int i = 0; i < a.length; ++i)
			a[i] = list.get(i);
	}

	public static void main(String[] args) {
		String[] a = { "a", "c", "d", "f", "g", "h" };
		insert(a, 1, "b");
		insert(a, 4, "e");
		System.out.println(Arrays.toString(a));
	}
}