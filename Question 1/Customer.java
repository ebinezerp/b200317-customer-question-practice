import java.util.Date;

public class Customer {
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
	public String toSting(){
		return  "id: "+id+"\nName: "+name+"\nMobile Number: "+mobileNumber+
		        "\nDate of Birth: "+birthdate+"\nAverage Spend Amount: "+averageSpendAmount+
		        "\nTotal Amount: "+totalAmount+"\nDate Enrolled: "+dateEnrolled+"\nRating: "+rating;

				/*  return String.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", "Id","Name","Mobile Number",
				"Date of Birth","Average spend amount","Total amount","Date Enrolled","Rating");   */
	}
	
	public boolean equals(Object obj){
		if (obj instanceof Customer){
			Customer customer = (Customer)obj;
			
			if (!this.mobileNumber.equals(customer.mobileNumber)){
				return false;
			}
			if (!this.birthdate.equals(customer.birthdate)){
				return false;
			}
		
			return true;
		}else {
			return false;
		}
	}
 
	
}