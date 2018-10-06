package ex03_01;

public class Example01 {
	static String reverse(String s) {
		StringBuilder sb=new StringBuilder(s); // String을 StringBuilder에 넣음
		sb=sb.reverse(); // StringBuilder 클래스 메소드인 reverse()
		return sb.toString(); // StringBuilder 문자열 this를 String 객체로 변환하여 리턴
	}

	public static void main(String[] args) {
		String s = "hello world";
		s = reverse(s);
		System.out.println(s);
	}
}