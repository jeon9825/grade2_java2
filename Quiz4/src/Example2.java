import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example2 {
	static void solution(List<Integer> list) { // ��� list���� 2�� ����� 3�� ����� ��� �����϶�
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int i = iterator.next();
			if (i % 2 == 0 || i % 3 == 0)
				iterator.remove();
		}
	}

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.addAll(Arrays.asList(new Integer[] { 1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7 }));
		System.out.println(a.toString());
		solution(a);
		System.out.println(a.toString());
	}
}
