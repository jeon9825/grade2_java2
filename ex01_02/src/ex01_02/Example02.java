package ex01_02;

public class Example02 {
	static int getVowelCount(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.toLowerCase().charAt(i)=='a'||
					s.toLowerCase().charAt(i)=='e'||
					s.toLowerCase().charAt(i)=='o'||
					s.toLowerCase().charAt(i)=='i'||
					s.toLowerCase().charAt(i)=='u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world" };
		for (String s : a) {
			int count = getVowelCount(s);
			System.out.printf("%s %d\n", s, count);
		}
	}
}
