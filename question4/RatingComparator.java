package question4;

import java.util.Comparator;

public class RatingComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getRating().compareTo(o2.getRating());
	}

}
