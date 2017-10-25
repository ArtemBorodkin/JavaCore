package less14HW2;

import java.util.Comparator;

import less14HW2.Commodity;

public class CommodityComparatorByMaterialGrowth implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o1.material.compareTo(o2.material);
	}


}
















