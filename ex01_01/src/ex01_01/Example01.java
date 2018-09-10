package ex01_01;

public class Example01 {
	public static void main(String[] args) {
		int[] a1 = new int[] { 345, 12, 478, 1003 };
		double[] a2 = new double[] { 23.24, 301.234, 3.1235, 98.0238 };
		String[] a3 = new String[] { "one", "two", "three", "four" };
		System.out.println("       int     double     String");
		System.out.println("---------- ---------- ----------");
		for (int i = 0; i < a1.length; ++i) {
			System.out.println(String.format("%10d", a1[i])+ " " + String.format("%10.3f", a2[i]) + " " + String.format("%10s", a3[i]));
		}
	}
}
/*
 * "% [argument index] [flag] [width] [.precision] type" 
[argument index] : 출력할 argument의 index를 지정한다. 이 값이 주어지지 않으면, format string 뒤에 오는 argument들 순서대로 출력된다. 
[flag] : 출력할 값이 숫자일 경우에, flag 가 + 이면 숫자 앞에 언제나 +- 부호를 붙인다. flag 가 0 이면, 숫자 앞에 0을 채워서 출력한다. 출력할 값이 문자열인 경우에, flag 가 - 이면 왼쪽 정렬로 출력되고, flag 가 없으면 오른쪽 정렬로 출력된다. 
[width] : 출력할 최소 폭을 지정한다. 
[.precession] : 숫자일 경우에 소숫점 아래 자릿수를 지정한다. 문자열일 경우에, 출력할 최대 문자수를 지정한다. 
type : 출력할 값의 타입을 지정한다. d 정수, s 문자열, f 실수, x 16진수.
*/