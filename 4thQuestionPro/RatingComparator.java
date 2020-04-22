package practicedQuestion4;

import java.util.Comparator;

public class RatingComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer obj1, Customer obj2) {
		return obj1.getRating().compareTo(obj2.getRating());
	}

}