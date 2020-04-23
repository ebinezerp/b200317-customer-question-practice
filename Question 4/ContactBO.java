import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;

public class ContactBO{

  public static Customer createCustomer(String line) throws ParseException{
	  
	  String[] customerDetails = linesplit(",");
	  Customer c1 = new Customer();
	  
	  Long id = Long.parseLong(customerDetails[0]);
	  
	  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	  Date birthdate = sdf.parse(customerDetails[3]);
	  
	  Double averageSpendAmount = Double.parseDouble(customerDetails[4]);
	  Double totalAmount = Double.parseDouble(customerDetails[5]);
	  Date dateEnrolled = sdf.parse(customerDetails[6]);
	  Double rating = Duble.raring(customer[7]);
	  
	  c1.SetId(id);
	  c1.setName(customerDateails[1]);
	  c1.setMobileNumber(customerDetails[2]);
	  c1.setBirthdate(datebirth);
	  c1.setAverageSpendAmount(averageSpendAmount);
	  c1.setTotalAmount(totalAmount);
	  c1.setDateEnrolled(dateEnrolled);
	  c1.setRating(rating);
	  
	  return c1;
  }
    public static List<Customer> findCustomer(List<Customer> customerList, String name){
		List<Customer> customer = new ArrayList<Customer>();
		
		for (Customer customer : customerList){
			if (customer.getName().equals(name)){
				customer.add(customer);
			}
		}
		return customer;
	}
	public satic List<Customer> findCustomer(List<Customer> customerList, Date birth){
		 List<Customer> customer = new ArrayList<Customer>();
		 
		 for(Customer customer : customerList){
			 SimpleDateFormatsdf = new SimpleDateFormat("dd-MM-yyyy");
			 Date birthdate = sdf.parse(customer);
			 if(customer.getBirthdate().equals(birth)){
				 customer.add(customer);
			 }
		 }
		 return customer;
	}
	public satic List<Customer> findCustomer(List<Customer> customerList, Double rating){
		 List<Customer> customer = new ArrayList<Customer>();
	 
         for (Customer customer : customerList){
			 if (customer.getRating().equals(rating)){
				 customer.add(customer);
			 }
		 }	
		 return customer;
	}
	
	
}