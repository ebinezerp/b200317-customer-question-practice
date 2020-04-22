package practicedQuestion4;

import java.util.Comparator;

public class AmountComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer obj1, Customer obj2) {
		return obj1.getAverageSpendAmount().compareTo(obj2.getAverageSpendAmount());
	}

}
