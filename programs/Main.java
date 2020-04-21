package practicedquestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of customer 1: ");
		String c1= sc.nextLine();
		System.out.println("Enter details of customer 2: ");
		String c2= sc.nextLine();
		
		String[] customer1=c1.split(",");
		String[] customer2=c2.split(",");
		System.out.println();
		
		Long id1= Long.parseLong(customer1[0]);
		SimpleDateFormat sdf1 =new SimpleDateFormat("dd-MM-yyyy");
		Date birthDate1= sdf1.parse(customer1[3]);
		Double averageSpendAmount1=Double.valueOf(customer1[4]);
		Double totalAmount1=Double.valueOf(customer1[5]);
		Date dateEnrolled1=sdf1.parse(customer1[6]);
		Double rating1=Double.valueOf(customer1[7]);
		System.out.println("customer 1 details ");
		Customer firstCustomer = new Customer(id1, customer1[1], customer1[2], birthDate1,averageSpendAmount1,totalAmount1, dateEnrolled1,rating1);
        System.out.println(firstCustomer);
		
		System.out.println();
		
		
		Long id2= Long.parseLong(customer2[0]);
		SimpleDateFormat sdf2 =new SimpleDateFormat("dd-MM-yyyy");
		Date birthDate2 = sdf2.parse(customer2[3]);
		Double averageSpendAmount2=Double.valueOf(customer2[4]);
		Double totalAmount2=Double.valueOf(customer2[5]);
		Date dateEnrolled2=sdf2.parse(customer2[6]);
		Double rating2=Double.valueOf(customer2[7]);
		Customer secondCustomer = new Customer(id2, customer2[1], customer2[2], birthDate2,averageSpendAmount2,totalAmount2, dateEnrolled2,rating2);
		System.out.println(secondCustomer);
		
		System.out.println();
		
		
		if (firstCustomer.equals(secondCustomer)) {
			System.out.println("Customer 1 is same as Customer 2");
		} else {
			System.out.println("Customer 1 and Customer 2 are different");
		}
		
		
	}
}
