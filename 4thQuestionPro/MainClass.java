package practicedQuestion4;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of customers: ");
		int num = sc.nextInt();
		sc.nextLine();
		List<Customer> customerList = new ArrayList<Customer>();
		for (int i = 0; i < num; i++) {
			String customerDetails = sc.nextLine();
			Customer customer = Customer.createCustomer(customerDetails);
			customerList.add(customer);
		}
		
		while (true) {
			System.out.println("Enter a type to sort:");
			System.out.println("1.name \n2.amount spent\n3.rating");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				
						
						Collections.sort(customerList);
						Iterator<Customer> it = customerList.iterator();
						while (it.hasNext()) {
						System.out.print(it.next() + " ");
						System.out.println();
						}
						break;
					}
			case 2:{
						Collections.sort(customerList, new AmountComparator());
						Iterator<Customer> it = customerList.iterator();
						while (it.hasNext()) {
						System.out.print(it.next() + " ");
						System.out.println();
						}
						break;
					}
			case 3:{
						Collections.sort(customerList, new RatingComparator());
						Iterator<Customer> it = customerList.iterator();
						while (it.hasNext()) {
						System.out.print(it.next() + " ");
						System.out.println();
						}
						break;
					}
			case 4:
				        System.out.println("inavalid choice");
				        sc.close();
					    System.exit(0);
			}
		}		
	}
}


