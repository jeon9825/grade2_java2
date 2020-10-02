import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Exam13 {
	static class Data {
		private int i;
		private String s;

		public Data(int i, String s) {
			this.i = i;
			this.s = s;
		}

		@Override
		public String toString() {
			return String.format("Data(%d, %s)", i, s);
		}

		@Override
		public int hashCode() {
			return Objects.hash(i, s);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj instanceof Data == false)
				return false;
			Data p = (Data) obj;
			return this.i == p.i && this.s == p.s;
		}
	}

	public static void solution(Data[] a) {
		Map<Data, Integer> map = new HashMap<>();
		for (Data key : a) {
			Integer count = map.get(key);
			if (count == null)
				count = 0;
			++count;
			map.put(key, count);
		}
		for (Data key : map.keySet())
			System.out.println(key.toString() + " = " + map.get(key) + "회");
	}

	public static void main(String[] args) {
		Data[] a = new Data[] { new Data(1, "a"), new Data(2, "b"), new Data(1, "a"), new Data(1, "a"),
				new Data(2, "b"), new Data(1, "c"), new Data(2, "b"), new Data(2, "a"), new Data(1, "c"),
				new Data(2, "a"), new Data(1, "a"), new Data(1, "b") };
		solution(a);
	}
}