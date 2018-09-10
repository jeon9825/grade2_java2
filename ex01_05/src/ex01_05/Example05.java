package ex01_05;

public class Example05 {

	// split1 �޼ҵ� ���� ���: String.replace �޼ҵ�� String.split �޼ҵ带 ����Ͽ� ����
	// split2 �޼ҵ� ���� ���: String.split �޼ҵ�� String.trim �޼ҵ带 ����Ͽ� ����

	static String[] split1(String s) {
		String[] arr = s.split(",");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].replace(" ", "");
		}
		return arr;
	}

	static String[] split2(String s) {
		String[] arr = s.split(",");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].trim();
		}
		return arr;
	}

	public static void main(String[] args) {
		String s = "One, Two ,Three , Four,Five";
		String[] a1 = split1(s);
		for (String t : a1)
			System.out.printf("[%s]\n", t);
		String[] a2 = split2(s);
		for (String t : a2)
			System.out.printf("[%s]\n", t);
	}
}
