package e2017.exam3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Example7 {
	static void solution(List<Integer> a) {
		Iterator<Integer> iterator = a.iterator();
		while (iterator.hasNext()) {
			int i = iterator.next();
			if (i % 2 == 0 || i % 3 == 0)
				iterator.remove();
		}

	}

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < 30; ++i)
			a.add(random.nextInt(8) + 1);
		System.out.println(a.toString());
		solution(a);
		System.out.println(a.toString());
	}
}