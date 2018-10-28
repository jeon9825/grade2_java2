package ex04_01;
//collection 실습문제

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;

public class Example01 {
	static void printCollection(String s, Collection<String> c) {
		String[] a = c.toArray(new String[0]);
		Arrays.sort(a);
		System.out.printf("%s: %s\n", s, Arrays.toString(a));
	}

	public static void main(String[] args) {
		Collection<String> c1 = new Stack<String>();
		Collection<String> c2 = new LinkedList<String>();
		Collection<String> c3 = new ArrayList<String>();
		for (int i = 0; i < 20; i += 2) {
			String s = String.format("%02d", i);
			c1.add(s);
		}
		printCollection("c1 (2의 배수)", c1);

		for (int i = 0; i < 20; i += 3) {
			String s = String.format("%02d", i);
			c2.add(s);
		}
		printCollection("c2 (3의 배수)", c2);

		// 교집합
		c3.clear();
		// c3.addAll(c1);
		// c3.retainAll(c2);
		for (String s : c1) {
			if (c2.contains(s)) {
				c3.add(s);
			}
		}
		printCollection("c1, c2 교집합", c3);

		// c1-c2
		c3.clear();
		// c3.addAll(c1);
		// c3.removeAll(c2);
		for (String s : c1) {
			if (!(c2.contains(s))) {
				c3.add(s);
			}
		}
		printCollection("c1, c2 차집합", c3);

		// c2-c1
		c3.clear();
		// c3.addAll(c2);
		// c3.removeAll(c1);
		for (String s : c2) {
			if (!(c1.contains(s))) {
				c3.add(s);
			}
		}
		printCollection("c2, c1 차집합", c3);

		// 합집합
		c3.clear();
		// c3.addAll(c1);
		// c3.removeAll(c2);
		// c3.addAll(c2);
		for (String s1 : c1) {
			c3.add(s1);

		}
		for (String s2 : c2) {
			if (!(c3.contains(s2))) {
				c3.add(s2);
			}
		}

		printCollection("c1, c2 합집합", c3);
	}
}