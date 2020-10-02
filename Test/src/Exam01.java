import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Exam01 {
	public static List<String> solution(List<String> list) { // 구현하라.
		List<String> list1= new ArrayList<>(new HashSet<String>(list));
		return list1;
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList("d", "a", "b", "a", "c", "d", "e", "f", "e"));
		List<String> list2 = solution(list1);
		System.out.println(list1);
		System.out.println(list2);
	}
}
