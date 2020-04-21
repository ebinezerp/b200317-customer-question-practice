import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.lang.Comparable;

public class Customer implements Comparable{
	private Long id;
	private String name;
	private String mobileNumber;
	private Date birthdate;
	private Double averageSpendAmount;
	private Double totalAmount;
	private Date dateEnrolled;
	private Double rating;

	public Customer()
	{
	
	}
	
	public Customer(Long id,String name,String mobileNumber,Date birthdate,Double averageSpendAmount,Double totalAmount,Date dateEnrolled,Double rating)
	{
		this.id=id;
		this.name=name;
		this.mobileNumber=mobileNumber;
		this.birthdate=birthdate;
		this.averageSpendAmount=averageSpendAmount;
		this.totalAmount=totalAmount;
		this.dateEnrolled=dateEnrolled;
		this.rating=rating;
	}
	
	public void setId(Long id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber=mobileNumber;
	}
	
	public void setBirthdate(Date birthdate)
	{
		this.birthdate=birthdate;
	}
	
	public void setAverageSpendAmount(Double averageSpendAmount)
	{
		this.averageSpendAmount=averageSpendAmount;
	}
	
	public void setTotalAmount(Double totalAmount)
	{
		this.totalAmount=totalAmount;
	}
	
	public void setDateEnrolled(Date dateEnrolled)
	{
		this.dateEnrolled=dateEnrolled;
	}
	
	public void setRating(Double rating)
	{
		this.rating=rating;
	}
	
	public Long getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getMobileNumber()
	{
		return mobileNumber;
	}
	
	public Date getBirthdate()
	{
		return birthdate;
	}
	
	public Double getAverageSpendAmount()
	{
		return averageSpendAmount;
	}
	
	public Double getTotalAmount()
	{
		return totalAmount;
	}
	
	public Date getDateEnrolled()
	{
		return dateEnrolled;
	}
	
	public Double getRating()
	{
		return rating;
	}
	
	
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
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String formatedDate = sdf.format(birthdate);
		String dateCreated = sdf.format(dateEnrolled);
		return String.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", id, name, mobileNumber, formatedDate,
				averageSpendAmount, totalAmount, dateCreated, rating);
	}
	public int compareTo(Object o){
		Customer cust= (Customer)o;
		return this.name.compareTo(cust.name);
	}

}





