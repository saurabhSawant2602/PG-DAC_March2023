package comparactors;

import java.util.Comparator;

import domain.Product;

public class CategoryComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getCategory().compareToIgnoreCase(p2.getCategory());
	}


}
