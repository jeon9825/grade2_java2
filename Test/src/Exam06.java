import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam06 {
	public static List<String> intersection(String[] a1, String[] a2) {
		List<String> list1 = Arrays.asList(a1);
		List<String> list2 = Arrays.asList(a2);
		List<String> list = new ArrayList<>();
		list.addAll(list1);
		list.retainAll(list2);

		List<String> resultList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if (!resultList.contains(list.get(i))) {
				resultList.add(list.get(i));
			}
		}
		return resultList;
	}

	public static void main(String[] args) {
		String[] a1 = { "a", "d", "a", "b", "b", "c" };
		String[] a2 = { "c", "a", "e", "f", "b", "g" };
		List<String> list = intersection(a1, a2);
		System.out.println(list.toString());
	}
}