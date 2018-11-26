import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {
	public static void main(String[] args) {
		String[] a1 = { "d", "a", "b", "a", "c", "a" };
		String[] a2 = { "b", "a", "f", "e", "b", "b" };

		List<String> listA1 = new ArrayList<String>();
		for (int i = 0; i < a1.length; i++) {
			listA1.add(a1[i]);
		}

		List<String> listA2 = new ArrayList<String>();
		for (int i = 0; i < a2.length; i++) {
			listA2.add(a2[i]);
		}
		List<String> list = new ArrayList<String>();
		list.addAll(listA1);
		list.retainAll(listA2);

		List<String> finalList = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			if (!finalList.contains(list.get(i)))
				finalList.add(list.get(i));
		}

		System.out.println(Arrays.toString(finalList.toArray()));
	}
}