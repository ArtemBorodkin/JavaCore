package less14HW2;

import java.util.Comparator;

import less14HW2.Commodity;

public class CommodityComparatorBySizeDecrease implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		return  Double.compare(o2.size, o1.size);
	}

}
