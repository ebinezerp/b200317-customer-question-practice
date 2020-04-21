import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


public class CustomerMainClass{
	public static void main(String[] args) throws ParseException
	{
		Scanner sc=new Scanner(System.in);
		
		Customer user1=new Customer();
		Customer user2=new Customer();
		
		System.out.println("Enter the details of customer1: ");
		String cust1=sc.nextLine();
		System.out.println("Enter the details of customer2: ");
		String cust2=sc.nextLine();
		
		String[] customer1=cust1.split(",");
		
		Long id=Long.parseLong(customer1[0]);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date dateOfBirth=sdf.parse(customer1[3]);
		
		/*
		String dateOfBirth=sdf.format(customer1[0]);
		Date date=sdf.parse(dateOfBirth);
		*/
		Double averageSpendAmount = Double.parseDouble(customer1[4]);
	
		Double totalAmount=Double.parseDouble(customer1[5]);
		
		Date dateCreated=sdf.parse(customer1[6]);
		
		/*
		String dateCreated=sdf.format(customer1[6]);
		Date dateEnrolled=sdf.parse(dateCreated);
		*/
		Double rating=Double.parseDouble(customer1[7]);
		
		user1.setId(id);
		user1.setName(customer1[1]);
		user1.setMobileNumber(customer1[2]);
		user1.setBirthdate(dateOfBirth);
		user1.setAverageSpendAmount(averageSpendAmount);
		user1.setTotalAmount(totalAmount);
		user1.setDateEnrolled(dateCreated);
		user1.setRating(rating);
		
		
		String[] customer2=cust2.split(",");
		
		id=Long.parseLong(customer2[0]);
		
		dateOfBirth=sdf.parse(customer2[3]);

		/*
		dateOfBirth=sdf.format(customer2[0]);
		date=sdf.parse(dateOfBirth);
		*/
		
		averageSpendAmount = Double.parseDouble(customer2[4]);
	
		totalAmount=Double.parseDouble(customer2[5]);
		
		dateCreated=sdf.parse(customer2[6]);
		
		
		/*
		dateCreated=sdf.format(customer2[6]);
		dateEnrolled=sdf.parse(dateCreated);
		*/
		rating=Double.parseDouble(customer2[7]);
		
		user2.setId(id);
		user2.setName(customer2[1]);
		user2.setMobileNumber(customer2[2]);
		user2.setBirthdate(dateOfBirth);
		user2.setAverageSpendAmount(averageSpendAmount);
		user2.setTotalAmount(totalAmount);
		user2.setDateEnrolled(dateCreated);
		user2.setRating(rating);
		
		
		System.out.println(user1);
		System.out.println("\n");
		System.out.println(user2);
		
		
		if(user1.equals(user2))
		{
			System.out.println("customer1 and customer2 are same");
		}
		else
		{
			System.out.println("customer1 and customer2 are different");
		}
	}
}
	