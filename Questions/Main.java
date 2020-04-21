import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main{
    public static void main(String[] args) throws ParseException{
		
		Scanner sc = new Scanner(System.in);
        
		Customer user1=new Customer();
		Customer user2=new Customer();
		
        System.out.println("Enter the details of customer 1: ");		
		String customer1 = sc.nextLine();
		System.out.println("Enter thr details of customer 2: ");
		String customer2 = sc.nextLine();
		
		String[] customer1=cust1.split(",");
		String[] customer2=cust2.split(",");
		
		Long id = Long.parseLong(customer1[0]);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date birthdate = sdf.parse(customer1[3]);
		Double averageSpendAmount = Double.parseDouble(customer1[4]);
		Double totalAmount = Double.parseDouble(customer1[5]);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date enrolledDate = sdf.parse(customer1[6]);
		Double rating = Double.parseDouble(customer1[7]);
		
		

		user1.setId(id);
		user1.setName(customer1[1]);
		user1.setMobileNumber(customer1[2]);
		user1.setBirthdate(dateOfBirth);
		user1.setAverageSpendAmount(averageSpendAmount);
		user1.setTotalAmount(totalAmount);
		user1.setDateEnrolled(dateEnrolled);
		user1.setRating(rating);

		System.out.println(user1);
		
		Long id = Long.parseLong(customer2[0]);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date birthdate = sdf.parse(customer2[3]);
		Double averageSpendAmount = Double.parseDouble(customer2[4]);
		Double totalAmount= Double.parseDouble(customer2[5]);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date enrolledDate = sdf.parse(customer2[6]);
		Double rating = Double.parseDouble(customer2[7]);
		
		user2.setId(id);
		user2.setName(customer2[1]);
		user2.setMobileNumber(customer2[2]);
		user2.setBirthdate(dateOfBirth);
		user2.setAverageSpendAmount(averageSpendAmount);
		user2.setTotalAmount(totalAmount);
		user2.setDateEnrolled(dateEnrolled);
		user2.setRating(rating);
		
		System.out.println(user2);
		
		if (user1.equals(user2)) {
			System.out.println("Customer 1 and Customer 2 are same");
		} else {
			System.out.println("Customer 1 and Customer 2 are different");
		}
	}

}