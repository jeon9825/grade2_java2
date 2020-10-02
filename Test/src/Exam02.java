import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam02 {
	public static void solution(List<String> list) { // 구현하라.
		 for (int i = 0; i < list.size(); i++) {
             for (int j = 0; j < list.size(); j++) {
                 if (i == j) {
                 } else if (list.get(j).equals(list.get(i))) {
                     list.remove(j);
                 }
             }
         }
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("d", "a", "b", "a", "c", "d", "e", "f", "e"));
		solution(list);
		System.out.println(list);
	}
}
