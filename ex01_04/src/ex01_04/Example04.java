package ex01_04;

public class Example04 {
	static String removeO(String s) {
		for (int i = 0; i < s.length();) {
			if (s.toLowerCase().charAt(i) == 'o')
				s=(s.substring(0,i)+s.substring(i+1));
			else
				i++;
		}
		return s;
	}

	public static void main(String[] args) {
		String[] a = new String[] {"One", "Two", "Three", "Four", "Five", "hello world", "yahoo" };
		for (String s : a) {
			String temp = removeO(s);
			System.out.println(temp);
		}
	}
}
