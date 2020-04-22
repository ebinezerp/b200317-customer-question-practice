import java.util.Comparator;

public class RatingComparator implements Comparator{
    public int compare(Object o1,Object o2){
	   if(o1==o2){
	      return 0;
	   }
	   Customer customer1=(Customer)o1;
	   Customer customer2=(Customer)o2;
	   
	   return customer1.getRating().compareTo(customer2.getRating());
	}
}