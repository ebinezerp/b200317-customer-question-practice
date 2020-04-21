package practicedquestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	 private Long id;
	 private String name;
	 private String mobileNo;
	 private Date birthDate;
	 private Double averageSpendAmount;
	 private Double totalAmount;
	 private Date dateEnrolled;
	 private Double rating;
	 
	 
	public Customer() {
		super();
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


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
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
	
/*	public static Customer customerList(String customer) throws ParseException {
		String[] customerDetails = customer.split(",");
		Long id= Long.parseLong(customerDetails[0]);
		Double averageSpendAmount=Double.valueOf(customerDetails[4]);
		Double totalAmount=Double.valueOf(customerDetails[5]);
		Double rating=Double.valueOf(customerDetails[7);
		
		SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");
		Date birthDate = sdf.parse(customerDetails[3]);
		Date dateEnrolled=sdf.parse(customerDetails[6]);
		Customer newCustomer = new Customer();
		newCustomer.setName(customerDetails[1]);
		newCustomer.setMobileNo(customerDetails[2]);
		newCustomer.setAverageSpendAmount(averageSpendAmount);
		newCustomer.setTotalAmount(totalAmount);
		newCustomer.setTotalAmount(rating);
		
		
	}
*/

	@Override
	public String toString() {
		return " id:" + id + "\n name:" + name + "\n mobileNo:" + mobileNo + "\n birthDate:" + birthDate
				+ "\n averageSpendAmount:" + averageSpendAmount + "\n totalAmount:" + totalAmount + "\n dateEnrolled:"
				+ dateEnrolled + "\n rating:" + rating + "";
	}
/*	public boolean equals(Object obj) {
		Customer customer= (Customer)obj;
		if(!(this.name.equals(customer.name))) {
			
		}*/


	

	@Override
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
	
		
		
	}
	 





