package e2017.exam3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Person == false)
			return false;
		Person p = (Person) obj;
		return this.age == p.age && Objects.equals(this.name, p.name);
	}
	
	@Override
	public String toString() {
		return String.format("Person(\"%s\"),%d", name, age);
	}
}

class PersonNameASC implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.name.compareTo(p2.name);
		if (r != 0)
			return r;
		return p1.age - p2.age;
	}
}

class PersonNameDESC implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.name.compareTo(p2.name);
		if (r != 0)
			return -1 * r;
		return p1.age - p2.age;
	}
}

class PersonAgeASC implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.age - p2.age;
		if (r != 0)
			return r;
		return p1.name.compareTo(p2.name);
	}
}

class PersonAgeDESC implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.age - p2.age;
		if (r != 0)
			return -1 * r;
		return p1.name.compareTo(p2.name);
	}
}

public class Example3 {
	static void sort1(List<Person> list) {
		Collections.sort(list, new PersonNameASC());
	}

	static void sort2(List<Person> list) {
		Collections.sort(list, new PersonNameDESC());
	}

	static void sort3(List<Person> list) {
		Collections.sort(list, new PersonAgeASC());
	}

	static void sort4(List<Person> list) {
		Collections.sort(list, new PersonAgeDESC());
	}

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 18));
		list.add(new Person("임꺽정", 19));
		list.add(new Person("전우치", 20));
		sort1(list);
		System.out.println(list.toString());
		sort2(list);
		System.out.println(list.toString());
		sort3(list);
		System.out.println(list.toString());
		sort4(list);
		System.out.println(list.toString());
	}
}