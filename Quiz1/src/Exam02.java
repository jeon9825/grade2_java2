
public class Exam02 {
	public static void main(String[] args) {
		// ������ �κ�
		Person[] a = new Person[] { new Person("ȫ�浿", "201132050", 2, 4.1), new Person("ȫ�浿", "201132050", 2, 4.1) };
		System.out.println(a[0] == a[1]);
		System.out.println(a[0].equals(a[1]));
	}
}