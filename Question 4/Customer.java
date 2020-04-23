import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Customer implements Comparable<Customer>{
    
    private Long id;
	private String name;
	private String mobileNumber;
	private Date birthdate;
	private Double averageSpendAmount;
	private Double totalAmount;
	private Date dateEnrolled;
	private Double rating;
	
	public Customer() {}
	
	public Customer(Long id, String name, String mobileNumber, Date birthdate, Double averageSpendAmount, 
	                Double totalAmount, Date dateEnrolled, Double rating){
		
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.birthdate = birthdate;
		this.averageSpendAmount = averageSpendAmount;
		this.totalAmount = totalAmount;
		this.dateEnrolled = dateEnrolled;
		this.rating = rating;
	}
	public void setId(Long id){
	    this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}	
	public void setBirthdate(Date birthdate){
		this.birthdate=birthdate;
	}
	public void setAverageSpendAmount(Double averageSpendAmount){
		this.averageSpendAmount=averageSpendAmount;
	}
	public void setTotalAmount(Double totalAmount){
		this.totalAmount=totalAmount;
	}
	public void setDateEnrolled(Date dateEnrolled){
		this.dateEnrolled=dateEnrolled;
	}
	public void setRating(Double rating){
		this.rating=rating;
	}
	public Long getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public Double getAverageSpendAmount(){
		return averageSpendAmount;
	}
	public Double getTotalAmount(){
		return totalAmount;
	}
	public Date getDateEnrolled(){
		return dateEnrolled;
	}
	public Double getRating(){
		return rating;
	}
    
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dateOfBirth = sdf.format(birthdate);
		String enrolledDate = sdf.format(dateEnrolled);
		return String.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", id, name, mobileNumber,
				birthdate,averageSpendAmount, totalAmount,dateEnrolled, rating);
	}
	
	public static Customer createCustomer(String line) throws ParseException {
		String[] customerDetails = line.split(",");

		Customer newCustomer = new Customer();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		newCustomer.setId(Long.parseLong(customerDetails[0]));
		newCustomer.setName(customerDetails[1]);
		newCustomer.setMobileNumber(customerDetails[2]);
		newCustomer.setBirthdate(sdf.parse(customerDetails[3]));
		newCustomer.setAverageSpendAmount(Double.parseDouble(customerDetails[4]));
		newCustomer.setTotalAmount(Double.parseDouble(customerDetails[5]));
		newCustomer.setDateEnrolled(sdf.parse(customerDetails[6]));
		newCustomer.setRating(Double.parseDouble(customerDetails[7]));

		return newCustomer;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compareTo(Customer o){
		
		return this.getName().compareTo(o.getName());
	}
}