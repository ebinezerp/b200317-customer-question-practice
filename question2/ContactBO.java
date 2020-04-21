import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ContactBO{
	public static Customer createCustomer(String line) throws ParseException
	{
		String[] customerDetails=line.split(",");
		Customer c1 = new Customer();
		
		Long id=Long.parseLong(customerDetails[0]);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date dateOfBirth=sdf.parse(customerDetails[3]);
		
		Double averageSpendAmount = Double.parseDouble(customerDetails[4]);
	
		Double totalAmount=Double.parseDouble(customerDetails[5]);
		
		Date dateCreated=sdf.parse(customerDetails[6]);
		Double rating=Double.parseDouble(customerDetails[7]);
		
		c1.setId(id);
		c1.setName(customerDetails[1]);
		c1.setMobileNumber(customerDetails[2]);
		c1.setBirthdate(dateOfBirth);
		c1.setAverageSpendAmount(averageSpendAmount);
		c1.setTotalAmount(totalAmount);
		c1.setDateEnrolled(dateCreated);
		c1.setRating(rating);
		return c1;
	}
			
	public static List<Customer> findCustomer(List<Customer> customerList,String name)
	{
		List<Customer> customer = new ArrayList<Customer>();
		for(Customer cus : customerList)
		{
			if(cus.getName().equals(name))
			{
				customer.add(cus);
			}
		}
		return customer;
	}
	
	public static List<Customer> findCustomer(List<Customer> customerList,Date birth)
	{
		List<Customer> customer = new ArrayList<Customer>();
		for(Customer cus : customerList)
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			String date1 = sdf.format(cus.getBirthdate());
			String date2 = sdf.format(birth);
			if (date1.equals(date2))
			{
				customer.add(cus);
			}
		}
		return customer;
	}
	
	public static List<Customer> findCustomer(List<Customer> customerList,Double rating)
	{
		List<Customer> customer = new ArrayList<Customer>();
		for(Customer cus : customerList)
		{
			String d1 = Double.toString(cus.getRating());
			String d2 = Double.toString(rating);
			if (d1.equals(d2)) {
				customer.add(cus);
			}
		}
		return customer;
	}
}