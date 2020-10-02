import java.util.ArrayList;
import java.util.List;

public class Exam07 {
	public static List<Integer> toList(int ... i) { 
		List<Integer> list = new ArrayList<>();
		for(int a:i)
			list.add(a);
		return list;
	}

	public static void main(String[] args) {
		System.out.println(toList(7));
		System.out.println(toList(2, 3, 5));
		System.out.println(toList(7, 3, 4, 5, 6));
	}
}