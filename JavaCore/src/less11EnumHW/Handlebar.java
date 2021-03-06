package less11EnumHW;

public class Handlebar {

	private String mark;
	private String material;
	private double size;
	private boolean hasButton;
	
	
	public Handlebar(String mark, String material, double size, boolean hasButton) {
		this.mark = mark;
		this.material = material;
		this.size = size;
		this.hasButton = hasButton;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	public String toString() {
		return "Handlebar [mark = " + mark + ", material = " + material + ", size = " + size + "]";
	}

	
	public boolean getHasButton() {
		return hasButton;
	}

	public void setHasButton(boolean hasButton) {
		this.hasButton = hasButton;
	}

	public void increaseSize() {
		size += 2;
		System.out.println(size);
	}
	

}
