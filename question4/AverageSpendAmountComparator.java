import java.util.Comparator;

public class AverageSpendAmountComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		if(o1==o2)
		{
			return 0;
		}
		
		Customer cust1=(Customer)o1;
		Customer cust2=(Customer)o2;
		
		{
			return cust1.getAverageSpendAmount().compareTo(cust2.getAverageSpendAmount());
		}
	}
}	
		