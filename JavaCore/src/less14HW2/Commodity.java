package less14HW2;

public class Commodity implements Comparable<Commodity>{

	double size;
	
	String material;
	
	double price;

	public Commodity(double size, String material, double price) {
		this.size = size;
		this.material = material;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Commodity [size=" + size + ", material=" + material + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Commodity o) {
		return Double.compare(this.size, o.size);
	}
	
	
	
}
