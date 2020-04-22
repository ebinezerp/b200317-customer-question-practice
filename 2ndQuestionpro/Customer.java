package practicedquestion2;

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
    public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String formatedDate = sdf.format(birthDate);
		String dateCreated = sdf.format(dateEnrolled);
		return String.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", id, name, mobileNo, formatedDate,
				averageSpendAmount, totalAmount, dateCreated, rating);
	}
	

	
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
	 





