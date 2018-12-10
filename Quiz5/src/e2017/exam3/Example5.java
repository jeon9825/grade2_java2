package e2017.exam3;

import java.util.Arrays;

public class Example5 {
	static String[] convertToArray(String s) {
		s=s.replaceAll("[^a-zA-Z]+", " ");
		s=s.trim();
		String[] arr = s.split(" "); 
		return arr;
//		method chaining
//		return s.replaceAll("[^a-zA-Z]+", " ").trim().split(" ");
		
	}

	public static void main(String[] args) {
		String[] a = { "one 2 two, - Three,\t four; @ \t\nfive..,SIX)",
				"1 one 2 two, - Three,\t four; @ \t\nfive..,SIX)" };
		for (String s : a) {
			String[] t = convertToArray(s);
			System.out.println(Arrays.toString(t));
		}
	}
}