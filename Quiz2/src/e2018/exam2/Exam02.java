package e2018.exam2;

import java.util.Arrays;

public class Exam02 {
	static String toString(Person[] a) {
		String []str =new String[a.length];
		for (int i = 0; i < a.length; i++) {
			str[i]=String.format("{\"%s\", %d}", a[i].name,a[i].age);
		}
		return Arrays.toString(str);
	}
	public static void main(String[] args) {
		Person[] a = new Person[] { new Person("È«±æµ¿", 18), new Person("ÀÓ²©Á¤", 21) };
		System.out.println(toString(a));
	}
}