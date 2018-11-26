import java.util.Objects;

class Product {
	int id;
	String name;
	String category;

	public Product(int id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
	}

	@Override
	public int hashCode() { // ����
		return Objects.hash(id, name, category);
	}

	@Override
	public boolean equals(Object obj) { // ����
		if (this == obj)
			return true;
		if (obj instanceof Product == false)
			return false;
		Product p = (Product) obj;
		return this.id == p.id && Objects.equals(this.name, p.name) && Objects.equals(this.category, p.category);
	}
}

public class Example7 {
	public static void main(String[] args) {
		Product product1 = new Product(1, "����", "�п�ǰ");
		Product product2 = new Product(2, "����", "�п�ǰ");
		Product product3 = new Product(1, "����", "�繫��ǰ");
		Product product4 = new Product(1, null, "�п�ǰ");
		Product product5 = new Product(1, "����", null);
		Product product6 = new Product(1, "����", "�п�ǰ");
		System.out.println(product1.equals(null));
		System.out.println(product1.equals(product2));
		System.out.println(product1.equals(product3));
		System.out.println(product1.equals(product4));
		System.out.println(product1.equals(product5));
		System.out.println(product1.equals(product6));
		System.out.println(product1.hashCode() == product6.hashCode());
	}
}