import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {
	static String[] convertToArray(String s) {
		// ���ڿ� s���� �ܾ �����Ͽ� �ܾ� ��� �迭�� �����϶�.
		// �ܾ�� ���ĺ���θ� �����Ǿ�� �Ѵ�.
		// ���ϵǴ� �迭�� �ܾ�� ���� �ҹ��ڷ� ��ȯ�Ǿ�� �Ѵ�.

		String regex = "[a-zA-Z]+";
		List<String> list = new ArrayList<>();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find())
			list.add(matcher.group(0).toLowerCase());
		return list.toArray(new String[0]);
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