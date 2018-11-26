import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {
	static int solution(List<Integer> list) { // ��� a���� ���� ���� �� �����ϴ� ���� ���� �����϶�
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (map.containsKey(list.get(i))) {
				Integer count = map.get(list.get(i));
				map.put(list.get(i), count + 1);
			} else {
				map.put(list.get(i), 1);
			}
		}
		int max = 0;
		for (Integer key : map.keySet())
			max = max < map.get(key) ? map.get(key) : max;
		return max;
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(new Integer[] { 1, 7, 1, 8, 5, 2, 2, 3, 5, 3, 1, 3, 7 });
		System.out.println(a.toString());
		int maxValue = solution(a);
		System.out.println(maxValue);
	}
}
