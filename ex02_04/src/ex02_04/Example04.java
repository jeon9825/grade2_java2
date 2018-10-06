package ex02_04;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Example04 {
	public static void main(String[] args) {
		Object[] a = new Object[3];
		Object[] b = a;
		
		a[0] = new double[] { 1.1, 2.2, 3.3 };
		a[1] = new String[] { "a", "b", "c" };
		
		Person p = new Person("¿”≤©¡§", 22);
		a[2] = new Person[] { p, p };
	}
}