package ex02_01;

public class Example01 {

	private static Object[] arr;

	public static void main(String[] args) {
		// ��
		addData(4);
		System.out.println(findIndex(1));
		System.out.println(findIndex("1"));
	}

	public static int findIndex(int value) {
		Integer val = new Integer(value);
		for (int j = 0; j < arr.length; j++) {
			if (val.equals(arr[j]))
				return j;
		}
		return -1; // ���� ��ã���� ��� -1 ��ȯ
	}

	public static int findIndex(String value) {
		String val = String.valueOf(value);
		for (int j = 0; j < arr.length; j++) {
			if (val.equals(arr[j]))
				return j;
		}
		return -1; // ���� ��ã���� ��� -1 ��ȯ
	}

	public static void addData(int count) {
		arr = new Object[count * 2];
		for (int i = 0; i < count; i++) {
			arr[2 * i] = new Integer(i); // ¦���� ° 2���� 1
			arr[2 * i + 1] = String.valueOf(i);
		}

		System.out.println(arr.length);
	}
}
