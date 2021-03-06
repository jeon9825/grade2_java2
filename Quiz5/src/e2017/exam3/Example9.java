package e2017.exam3;

import java.util.Date;

public class Example9 {
	static boolean sameClass(Object o1, Object o2) {
		if (o1.getClass() == o2.getClass())
			return true;
		else
			return false;
	}

	@SuppressWarnings("rawtypes")
	static boolean sameClass(Object o1, Class cls) {
		if (o1.getClass() == cls)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String s1 = "hello", s2 = "world";
		Date d = new Date();
		System.out.println(sameClass(s1, d));
		System.out.println(sameClass(s1, s2));
		System.out.println(sameClass(s1, String.class));
	}
}