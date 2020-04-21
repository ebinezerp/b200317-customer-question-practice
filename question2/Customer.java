import java.util.Date;
import java.text.SimpleDateFormat;

public class Customer{
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
	
	
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String formatedDate = sdf.format(birthdate);
		String dateCreated = sdf.format(dateEnrolled);
		return String.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", id, name, mobileNumber, formatedDate,
				averageSpendAmount, totalAmount, dateCreated, rating);
	}
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer cus = (Customer) obj;
			if (!this.mobileNumber.equals(cus.mobileNumber)) {
				return false;
			}
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			String date1 = sdf.format(this.birthdate);
			String date2 = sdf.format(cus.birthdate);
			if (!date1.equals(date2)) {
				return false;
			}
		}
		return true;
	}
}





