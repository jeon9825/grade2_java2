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
[argument index] : ����� argument�� index�� �����Ѵ�. �� ���� �־����� ������, format string �ڿ� ���� argument�� ������� ��µȴ�. 
[flag] : ����� ���� ������ ��쿡, flag �� + �̸� ���� �տ� ������ +- ��ȣ�� ���δ�. flag �� 0 �̸�, ���� �տ� 0�� ä���� ����Ѵ�. ����� ���� ���ڿ��� ��쿡, flag �� - �̸� ���� ���ķ� ��µǰ�, flag �� ������ ������ ���ķ� ��µȴ�. 
[width] : ����� �ּ� ���� �����Ѵ�. 
[.precession] : ������ ��쿡 �Ҽ��� �Ʒ� �ڸ����� �����Ѵ�. ���ڿ��� ��쿡, ����� �ִ� ���ڼ��� �����Ѵ�. 
type : ����� ���� Ÿ���� �����Ѵ�. d ����, s ���ڿ�, f �Ǽ�, x 16����.
*/