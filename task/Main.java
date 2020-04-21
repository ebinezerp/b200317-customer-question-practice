import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Main{
   public static void main(String[] args) throws ParseException{
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the details of Customer 1:");
	  String customer1=sc.nextLine();
	  
	  System.out.println("Enter the details of Customer 2:");
	  String customer2=sc.nextLine();
	  
	  String[] cust1=customer1.split(",");
	  String[] cust2=customer2.split(",");
	  
	  System.out.println("Details of Customer 1:");
	  Long id1=Long.parseLong(cust1[0]);
	  SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	  Date birthdate1=sdf.parse(cust1[3]);
	  Double averageSpendAmount1=Double.parseDouble(cust1[4]);
	  Double totalAmount1=Double.parseDouble(cust1[5]);
	  SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy");
	  Date dateEnrolled1=sdf2.parse(cust1[6]);
	  Double rating1=Double.parseDouble(cust1[7]);
	  
	  Customer c1=new Customer(id1,cust1[1],cust1[2],birthdate1,averageSpendAmount1,totalAmount1,dateEnrolled1,rating1);
	  System.out.println(c1);
	  System.out.println();
	  
	  System.out.println("Details of Customer 2:");
	  Long id2=Long.parseLong(cust2[0]);
	  SimpleDateFormat sdf3=new SimpleDateFormat("dd/MM/yyyy");
	  Date birthdate2=sdf3.parse(cust2[3]);
	  Double averageSpendAmount2=Double.parseDouble(cust2[4]);
	  Double totalAmount2=Double.parseDouble(cust2[5]);
	  SimpleDateFormat sdf4=new SimpleDateFormat("dd/MM/yyyy");
	  Date dateEnrolled2=sdf4.parse(cust2[6]);
	  Double rating2=Double.parseDouble(cust2[7]);
	  
	  Customer c2=new Customer(id2,cust2[1],cust2[2],birthdate2,averageSpendAmount2,totalAmount2,dateEnrolled2,rating2);
	  System.out.println(c2);
	  System.out.println();
	  
	  if(c1.equals(c2)){
	     System.out.println("Customer1 is same as Customer 2");
	  }else{
	  System.out.println("Customer1 is different from Customer 2");
	  }
   }
 }
