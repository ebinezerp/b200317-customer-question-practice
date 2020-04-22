package practicedquestion2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContactBO {
	
	 public static Customer createCustomer(String line) throws ParseException {
		 
		    String[] customerDetails = line.split(",");
		 
		    Customer newCustomer = new Customer();
		 
		    Long id=Long.parseLong(customerDetails[0]);
			
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			Date birthDate=sdf.parse(customerDetails[3]);
			
			Double averageSpendAmount = Double.parseDouble(customerDetails[4]);
		
			Double totalAmount=Double.parseDouble(customerDetails[5]);
			
			Date dateCreated=sdf.parse(customerDetails[6]);
			Double rating=Double.parseDouble(customerDetails[7]);
			
			newCustomer.setId(id);
			newCustomer.setName(customerDetails[1]);
			newCustomer.setMobileNo(customerDetails[2]);
			newCustomer.setBirthDate(birthDate);
			newCustomer.setAverageSpendAmount(averageSpendAmount);
			newCustomer.setTotalAmount(totalAmount);
			newCustomer.setDateEnrolled(dateCreated);
			newCustomer.setRating(rating);
			return newCustomer;
		 
		 
	 }
	 public static List<Customer> findCustomer(List<Customer> customerList,String name){
		 
		 List<Customer> list = new ArrayList<Customer>();
		 for(Customer customer:customerList) {
			 
			 if(customer.getName().equals(name)) {
				 list.add(customer);
				 
			 }
		 }
		 return list;
		 
		 
	 }
	 public static List<Customer> findCustomer(List<Customer> customerList,Date birth){
		
			List<Customer> list = new ArrayList<Customer>();
			for(Customer customer : customerList)
			{
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				String date1 = sdf.format(customer.getBirthDate());
				String date2 = sdf.format(birth);
				if (date1.equals(date2))
				{
					list.add(customer);
				}
			}
			return list;
		}
	 
	 
	 public static List<Customer> findCustomer(List<Customer> customerList,Double rating){
		
			List<Customer> list= new ArrayList<Customer>();
			for(Customer customer : customerList)
			{
				String d1 = Double.toString(customer.getRating());
				String d2 = Double.toString(rating);
				if (d1.equals(d2)) {
					list.add(customer);
				}
			}
			return list;
		}

	
	

}
