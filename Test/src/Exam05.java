import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam05 {
	public static List<String> union(String[] a1, String[] a2) {
		List<String> list1 = Arrays.asList(a1);
		List<String> list2 = Arrays.asList(a2);
		List<String> list = new ArrayList<>();
		list.addAll(list1);
		list.removeAll(list2);
		list.addAll(list2);
		return list;
	}

	public static void main(String[] args) {
		String[] a1 = { "a", "d", "a", "b", "b", "c" };
		String[] a2 = { "c", "a", "e", "f", "b", "g" };
		List<String> list = union(a1, a2);
		System.out.println(list.toString());
	}
}