import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Application{
	public static void main(String[] args) throws ParseException
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of customers: ");
		int num = sc.nextInt();
		sc.nextLine();
		List<Customer> customerList = new ArrayList<Customer>();
		for (int i = 0; i < num; i++) {
			String customerDetails = sc.nextLine();
			Customer cust = Customer.createCustomer(customerDetails);
			customerList.add(cust);
		}
		
		while (true) {
			System.out.println("Enter a type to sort:");
			System.out.println("1.Sort by name \n2.Sort by spent amount \n3.Sort by rating\n4. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
						Collections.sort(customerList);
						Iterator it = customerList.iterator();
						while (it.hasNext()) {
						System.out.print(it.next() + " ");
						System.out.println();
						}
						break;
					}
			case 2:{
						Collections.sort(customerList, new AverageSpendAmountComparator());
						Iterator it = customerList.iterator();
						while (it.hasNext()) {
						System.out.print(it.next() + " ");
						System.out.println();
						}
						break;
					}
			case 3:{
						Collections.sort(customerList, new RatingComparator());
						Iterator it = customerList.iterator();
						while (it.hasNext()) {
						System.out.print(it.next() + " ");
						System.out.println();
						}
						break;
					}
			case 4:
					System.exit(0);
			}
		}	
	}
}
		

		