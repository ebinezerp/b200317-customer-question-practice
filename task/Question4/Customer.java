import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
class Customer implements Comparable{
  private Long id;
  private String name;
  private String mobileNumber;
  private Date birthdate;
  private Double averageSpendAmount;
  private Double totalAmount;
  private Date dateEnrolled;
  private Double rating;
  
  public Customer(){
	  super();
  }
  
  public Customer(Long id,String name,String mobileNumber,Date birthdate,Double averageSpendAmount,Double totalAmount,Date dateEnrolled,Double rating){
	  super();
	  
      this.id=id;
	  this.name=name;
	  this.mobileNumber=mobileNumber;
	  this.birthdate=birthdate;
	  this.averageSpendAmount=averageSpendAmount;
	  this.totalAmount=totalAmount;
	  this.dateEnrolled=dateEnrolled;
	  this.rating=rating;
	  
  }
  public void setId(Long id){
      this.id=id;
  }
  public Long getId(){
      return id;
  }
  public void setName(String name){
      this.name=name;
  }
  public String getName(){
      return name;
  }
  public void setMobileNumber(String mobileNumber){
      this.mobileNumber=mobileNumber;
  }
  public String getMobileNumber(){
      return mobileNumber;
  }
  public void setBirthdate(Date birthdate){
      this.birthdate=birthdate;
  }
  public Date getBirthdate(){
      return birthdate;
  }
  public void setAverageSpendAmount(Double averageSpendAmount){
     this.averageSpendAmount=averageSpendAmount;
  }
  public Double getAverageSpendAmount(){
     return averageSpendAmount;
  }
  public void setTotalAmount(Double totalAmount){
     this.totalAmount=totalAmount;
  }
  public Double getTotalAmount(){
     return totalAmount;
  }
  public void setDateEnrolled(Date dateEnrolled){
     this.dateEnrolled=dateEnrolled;
  }
  public Date getDateEnrolled(){
      return dateEnrolled;
  }
  public void setRating(Double rating){
     this.rating=rating;
  }
  public Double getRating(){
      return rating;
  }
  public static Customer createCustomer(String line) throws ParseException{
   String[] customerDetails=line.split(",");
   
   Customer newCustomer=new Customer();
   
   newCustomer.setId(Long.parseLong(customerDetails[0]));
   newCustomer.setName(customerDetails[1]);
   newCustomer.setMobileNumber(customerDetails[2]);
   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
   newCustomer.setBirthdate(sdf.parse(customerDetails[3]));
   newCustomer.setAverageSpendAmount(Double.parseDouble(customerDetails[4]));
   newCustomer.setTotalAmount(Double.parseDouble(customerDetails[5]));
   newCustomer.setDateEnrolled(sdf.parse(customerDetails[6]));
   newCustomer.setRating(Double.parseDouble(customerDetails[7]));
   
   return newCustomer;
 }
  
  public String toString(){
	     SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		 String birthDate=sdf.format(birthdate);
		 String dateenrolled=sdf.format(dateEnrolled);
		 
		 return String.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s\n","id","Name","Mobile Number","Date of Birth","Average Spent amount","Total amount","Rating");
	 }
						
	public int compareTo(Object o){
	    Customer customer=(Customer)o;
		return this.name.compareTo(customer.name);
	 }
}
  










