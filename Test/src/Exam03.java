import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam03 {
	public static void solution(String s) {
		String regex = "[0-9]+";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);

		while (m.find())
			System.out.println(m.group(0));
	}

	public static void main(String[] args) {
		String s = "a1223 (235) 157, 7814; asd_32as";
		solution(s);
	}
}
