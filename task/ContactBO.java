import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.ArrayList;
public class ContactBO{
 public static Customer createCustomer(String line) throws ParseException{
   String[] customerDetails=line.split(",");
   
   Customer newCustomer=new Customer();
   
   newCustomer.setId(Long.parseLong(customerDetails[0]));
   newCustomer.setName(customerDetails[1]);
   newCustomer.setMobileNumber(customerDetails[2]);
   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
   newCustomer.setBirthdate(sdf.parse(customerDetails[3]));
   newCustomer.setAverageSpendAmount(Double.parseDouble(customerDetails[4]));
   newCustomer.setTotalAmount(Double.parseDouble(customerDetails[5]));
   newCustomer.setDateEnrolled(sdf.parse(customerDetails[6]));
   newCustomer.setRating(Double.parseDouble(customerDetails[7]));
   
   return newCustomer;
 }
 public static List<Customer> findCustomer(List<Customer> customerList,String name){
      List<Customer> customerType=new ArrayList<Customer>();

        for(Customer customer:customerList){
		  if(customer.getName().equals(name)){
		     customerType.add(customer);
		  }
		}			
		return customerType;
 }
 
 public static List<Customer> findCustomer(List<Customer> customerList,Date birth){
       List<Customer> customerType=new ArrayList<Customer>();
	   
	   for(Customer customer:customerList){
	     if(customer.getBirthdate().equals(birth)){
		     customerType.add(customer);
		 }
	   }
	   return customerType;
 }
 public static List<Customer> findCustomer(List<Customer> customerList,Double rating){
       List<Customer> customerType=new ArrayList<Customer>();
	   
	   for(Customer customer:customerList){
	     if(customer.getRating().equals(rating)){
		     customerType.add(customer);
		 }
	   }
	   return customerType;
 }
}