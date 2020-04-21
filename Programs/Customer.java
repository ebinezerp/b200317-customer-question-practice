package customer_table_booking;

import java.text.SimpleDateFormat;
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

	public Customer() {

	}

	public Customer(Long id, String name, String mobileNumber, Date birthdate, Double averageSpendAmount,
			Double totalAmount, Date dateEnrolled, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.birthdate = birthdate;
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
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
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

	/*
	 * public String toString() { return "Id:" + id + "\nName:" + this.name +
	 * "\nMobile Number:" + this.mobileNumber + "\nDate of Birth:" + this.birthdate
	 * + "\nAverage spent amount:" + this.averageSpendAmount + "\nTotal amount:" +
	 * this.totalAmount + "\nDate Enrolled:" + this.dateEnrolled + "\nRating:" +
	 * this.rating; }
	 */

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dateOfBirth = sdf.format(birthdate);
		String enrolledDate = sdf.format(dateEnrolled);
		return String.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", id, name, mobileNumber, dateOfBirth,
				averageSpendAmount, totalAmount, enrolledDate, rating);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer cus = (Customer) obj;

			if (!this.mobileNumber.equals(cus.mobileNumber)) {
				return false;
			}
			if (!this.birthdate.equals(cus.birthdate)) {
				return false;
			}
		}
		return true;
	}

}
