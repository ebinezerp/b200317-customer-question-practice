package question4;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		ContactBO BO = new ContactBO();

		List<Customer> customerList = new ArrayList<Customer>();
		System.out.println("Enter the number of customers:");
		int num = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < num; i++) {
			String customerDetails = sc.nextLine();
			Customer customer = BO.createCustomer(customerDetails);
			customerList.add(customer);
		}

		while (true) {
			System.out.println("Enter a type to sort:");
			System.out.println("1.Name \n2.Amount Spent \n3.Rating");
			int option = sc.nextInt();
			sc.hasNextLine();

			switch (option) {
			case 1: {
				Collections.sort(customerList, new Customer());
				Iterator iterator = customerList.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next() + " ");
					System.out.println();
				}
				break;
			}
			case 2: {
				Collections.sort(customerList, new AmountComparator());
				Iterator iterator = customerList.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next() + " ");
					System.out.println();
				}
				break;
			}
			case 3: {
				Collections.sort(customerList, new RatingComparator());
				Iterator iterator = customerList.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next() + " ");
					System.out.println();
				}
				break;
			}
			default: {
				System.exit(0);
			}
			}
		}
	}

}
