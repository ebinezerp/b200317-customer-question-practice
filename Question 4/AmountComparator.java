public class AmountComparator implements Comparator{
     public int compare(Object obj1,Object obj2){
		if(obj1==obj2){
			return 0;
		}

		Customer cust1=(Customer)o1;
		Customer cust2=(Customer)o2;

			return cust1.getAverageSpendAmount().compareTo(cust2.getAverageSpendAmount());
	
	}

}