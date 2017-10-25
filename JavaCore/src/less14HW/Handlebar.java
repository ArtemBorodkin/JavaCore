package less14HW;

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
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (hasButton ? 1231 : 1237);
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Handlebar))
			return false;
		Handlebar other = (Handlebar) obj;
		if (hasButton != other.hasButton)
			return false;
		if (mark == null) {
			if (other.mark != null)
				return false;
		} else if (!mark.equals(other.mark))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Handlebar [mark=" + mark + ", material=" + material + ", size=" + size + ", hasButton=" + hasButton
				+ "]";
	}

	public boolean hasButton() {
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
