package e2017.exam3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
	static List<String> solution(String[] a1, String[] a2, String[] a3) {
		List<String> list = new ArrayList<>();
		List<String> c1 = Arrays.asList(a1);
		List<String> c2 = Arrays.asList(a2);
		List<String> c3 = Arrays.asList(a3);

		list.addAll(c1);
		list.retainAll(c2);
		list.retainAll(c3);
		return list;
	}

	public static void main(String[] args) {
		String[] a1 = { "A", "B", "D", "F", "G" };
		String[] a2 = { "B", "C", "F", "H", "I" };
		String[] a3 = { "B", "F", "G", "H", "I" };
		System.out.println(solution(a1, a2, a3));
	}
}