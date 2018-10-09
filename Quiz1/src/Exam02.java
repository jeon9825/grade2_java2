
public class Exam02 {
	public static void main(String[] args) {
		// 구현할 부분
		Person[] a = new Person[] { new Person("홍길동", "201132050", 2, 4.1), new Person("홍길동", "201132050", 2, 4.1) };
		System.out.println(a[0] == a[1]);
		System.out.println(a[0].equals(a[1]));
	}
}