import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		if (p1 == p2)
			return 0;
		if (p1 == null)
			return -1;
		if (p2 == null)
			return 1;

		int r1; // 우선순위 1
		if (p1.name == null) { // p1.name 값이 null일 경우
			r1 = p2.name == null ? 0 : -1; // p2.name 값이 null이면 0, 아니면 -1
		} else {
			r1 = p1.name.compareTo(p2.name);
		}
		if (r1 != 0)
			return r1;

		int r2 = p1.price - p2.price;// 우선순위2
		if (r2 != 0)
			return r2;

		int r3 = p1.id - p2.id; // 우선순위 3
		return r3;
	}

}
