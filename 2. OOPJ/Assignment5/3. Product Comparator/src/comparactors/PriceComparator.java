package comparactors;

import java.util.Comparator;

import domain.Product;

public class PriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		return (int) ( p1.getPrice() -p2.getPrice());
	}

}
