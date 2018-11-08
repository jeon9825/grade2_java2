package ex06_01;

import java.util.LinkedList;
import java.util.List;

public class Example01 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < 99; i++) {
			list.add(i);
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 1) {
				list.remove(i);
				i--;
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
