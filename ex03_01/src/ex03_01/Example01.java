package ex03_01;

public class Example01 {
	static String reverse(String s) {
		StringBuilder sb=new StringBuilder(s); // String�� StringBuilder�� ����
		sb=sb.reverse(); // StringBuilder Ŭ���� �޼ҵ��� reverse()
		return sb.toString(); // StringBuilder ���ڿ� this�� String ��ü�� ��ȯ�Ͽ� ����
	}

	public static void main(String[] args) {
		String s = "hello world";
		s = reverse(s);
		System.out.println(s);
	}
}