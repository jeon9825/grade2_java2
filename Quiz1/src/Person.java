
import java.util.Objects;

public class Person {
	String name;
	String no;
	int year;
	double grade;

	public Person(String name, String no, int year, double grade) {
		this.name = name;
		this.no = no;
		this.year = year;
		this.grade = grade;
	}

	// ������ �κ�
	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Person) == false)
			return false;
		Person p = (Person) obj;
		return Objects.equals(this.name, p.name) && Objects.equals(this.no, p.no) && this.year == p.year
				&& this.grade == p.grade;
	}
}