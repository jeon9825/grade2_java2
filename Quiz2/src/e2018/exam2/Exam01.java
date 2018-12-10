package e2018.exam2;

public class Exam01 {
	public static double average(int... a) {
		int count = a.length;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / (double)count; 
//		return (double) sum / count;          * 형변환 연산자를 먼저 함. 실수/정수 = 실수(내림을 안함)
//		return (double) sum / (double) count; * 실수/실수 = 실수
//		return (double) (sum / count);        * 정수/정수 => 정수 틀린거임.
	}
//  ***연산자 우선순위***
//	객체 연산자(객체.변수, 객체.메소드 에서 .), 배열 연산자(배열[i] 에서 괄호[])
//	단항 연산자
//	곱셈, 나눗셈
//	덧셈, 뺄셈
//	비교 연산자
//	비트 연산자
//	대입 연산자
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5 };
		System.out.println(average(2, 3));
		System.out.println(average(2, 3, 4));
		System.out.println(average(a));
	}
}