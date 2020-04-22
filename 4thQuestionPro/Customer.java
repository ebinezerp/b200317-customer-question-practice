package practicedQuestion4;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Customer implements Comparable<Customer> {

	private Long id;
	private String name;
	private String mobileNo;
	private Date birthDate;
	private Double averageSpendAmount;
	private Double totalAmount;
	private Date dateEnrolled;
	private Double rating;

	public Customer() {

	}

	public Customer(Long id, String name, String mobileNo, Date birthDate, Double averageSpendAmount,
			Double totalAmount, Date dateEnrolled, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.birthDate = birthDate;
		this.averageSpendAmount = averageSpendAmount;
		this.totalAmount = totalAmount;
		this.dateEnrolled = dateEnrolled;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNo;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNo = mobileNumber;
	}

	public Date getBirthdate() {
		return birthDate;
	}

	public void setBirthdate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getAverageSpendAmount() {
		return averageSpendAmount;
	}

	public void setAverageSpendAmount(Double averageSpendAmount) {
		this.averageSpendAmount = averageSpendAmount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getDateEnrolled() {
		return dateEnrolled;
	}

	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dateOfBirth = sdf.format(birthDate);
		String enrolledDate = sdf.format(dateEnrolled);
		return String.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", id, name, mobileNo, dateOfBirth,
				averageSpendAmount, totalAmount, enrolledDate, rating);
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
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
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
