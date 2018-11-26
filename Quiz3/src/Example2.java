import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example2 {
	static void add(List<Integer> list, int count) { // list ��Ͽ� 0���� count ���� ������ �߰��Ѵ�.
		for (int i = 0; i < count; i++) {
			list.add(i);
		}
	}

	static void removeEven(List<Integer> list) { // list ��Ͽ��� ¦���� ���� �����Ѵ�.
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int i = iterator.next();
			if (i % 2 == 0)
				iterator.remove();
		}
	}

	static void addEven(List<Integer> list) { // list ����� Ȧ�� ���� ���̿� ¦�� ���� �����Ѵ�.
		ListIterator<Integer> iterator = list.listIterator();
		while (iterator.hasNext()) {
			int i = iterator.next();
			if (i % 2 == 1) {
				iterator.previous();
				iterator.add(i - 1);
				i = iterator.next();
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		add(list, 10);
		System.out.println(list.toString());
		removeEven(list);
		System.out.println(list.toString());
		addEven(list);
		System.out.println(list.toString());
	}
}