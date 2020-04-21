import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
class Customer{
  private Long id;
  private String name;
  private String mobileNumber;
  private Date birthdate;
  private Double averageSpendAmount;
  private Double totalAmount;
  private Date dateEnrolled;
  private Double rating;
  
  public Customer(){
  }
  
  public Customer(Long id,String name,String mobileNumber,Date birthdate,Double averageSpendAmount,Double totalAmount,Date dateEnrolled,Double rating){
	  
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
  public String toString(){
     return "id:"+id+"\nName:"+name+"\nMobile Number:"+mobileNumber+"\nBirth Date:"+birthdate+"\nAverage Spend Amount:"+averageSpendAmount+"\nTotal Amount:"+totalAmount+"\nDate Enrolled:"+dateEnrolled+"\nRating:"+rating;
	 
  }
						
	// comparing the customer refference is equal to the object refference
  public boolean equals(Object obj){
	  if(obj instanceof Customer){
			Customer customer=(Customer)obj;//assigning sub class refference to super class(up casting)
			if(!this.name.equals(customer.name)){
       	      return false;
			}
			if(!this.mobileNumber.equals(customer.mobileNumber)){
			  return false;
			}
			if(!this.birthdate.equals(customer.birthdate)){
			   return false;
			}
			return true;
	  }else{
		  return false;
	  }
  }
}

  










