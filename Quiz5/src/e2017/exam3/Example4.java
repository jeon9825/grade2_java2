package e2017.exam3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {
	public static void main(String[] args) {
		String s = "<tr><td>홍길동</td><td>18</td></tr><tr><td>임꺽정</td><td>19</td></tr>"
				+ "<span>false</span><div><span>true</span></div>";
		String regex = "(\\<[a-zA-Z]+[^>]+[\\>])([^<]*)(\\<\\/[a-zA-Z]+\\>)";
//		String regex = "<([a-z]+)>([^<]+)</[a-z]+>"; //정규식으로 태그찾기
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);

		while (m.find()) {
			System.out.printf("TAG:%s TEXT:%s", m.group(1), m.group(2));
			System.out.println();
		}
	}
}