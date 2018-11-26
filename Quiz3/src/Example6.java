import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Example6 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[20];
		for (int i = 0; i < a.length; ++i)
			a[i] = random.nextInt(5);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				Integer count = map.get(a[i]);
				map.put(a[i], count + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(i + "=" + map.get(i)+" ");
		}
	}
}