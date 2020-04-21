package question4;

import java.util.Comparator;

public class AmountComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getAverageSpendAmount().compareTo(o2.getAverageSpendAmount());
	}

}
