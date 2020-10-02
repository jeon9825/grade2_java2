import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam04 {
	public static String[] solution(String s) { // 구현하라.
		String regex = "[0-9]+";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);

		List<String> list = new ArrayList<>();
		while (m.find()) {
			list.add(m.group(0));
		}
		return list.toArray(new String[] {});
	}

	public static void main(String[] args) {
		String s = "a1223 (235) 157, 7814; asd_32as";
		String[] a = solution(s);
		System.out.println(Arrays.toString(a));
	}
}
