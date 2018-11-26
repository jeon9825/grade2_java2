import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example3 {
	public static void main(String[] args) {
		String[] a = { "d", "a", "b", "a", "c", "d", "e", "f", "e" };
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		System.out.println(Arrays.toString(set.toArray()));
	}
}
