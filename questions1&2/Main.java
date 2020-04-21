package customer_table_booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		System.out.println("Enter the details of Customer 1:");
		Scanner sc = new Scanner(System.in);
		String customer1 = sc.nextLine();
		System.out.println("Enter the details of Customer 2:");
		String customer2 = sc.nextLine();

		String[] cus1 = customer1.split(",");
		String[] cus2 = customer2.split(",");
		System.out.println();

		Long id1 = Long.parseLong(cus1[0]);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date dateBirth = sdf.parse(cus1[3]);
		Double asa1 = Double.parseDouble(cus1[4]);
		Double amount1 = Double.parseDouble(cus1[5]);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		Date enrolledDate = sdf2.parse(cus1[6]);
		Double rate1 = Double.parseDouble(cus1[7]);

		System.out.println("Details of customer 1:");
		Customer customerOne = new Customer(id1, cus1[1], cus1[2], dateBirth, asa1, amount1, enrolledDate, rate1);
		System.out.println(customerOne);
		
		System.out.println();
		
		Long id2 = Long.parseLong(cus2[0]);
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy");
		Date dateBirth2 = sdf3.parse(cus2[3]);
		Double asa2 = Double.parseDouble(cus2[4]);
		Double amount2 = Double.parseDouble(cus2[5]);
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MM-yyyy");
		Date enrolledDate2 = sdf4.parse(cus2[6]);
		Double rate2 = Double.parseDouble(cus2[7]);

		System.out.println("Details of customer 2:");
		Customer customerTwo = new Customer(id2, cus2[1], cus2[2], dateBirth2, asa2, amount2, enrolledDate2, rate2);
		System.out.println(customerTwo);

		System.out.println();

		if (customerOne.equals(customerTwo)) {
			System.out.println("Customer 1 is same as Customer 2");
		} else {
			System.out.println("Customer 1 and Customer 2 are different");
		}
	}

}
