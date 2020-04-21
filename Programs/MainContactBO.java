package customer_table_booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainContactBO {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		ContactBO BO = new ContactBO();
		List<Customer> customerList = new ArrayList();
		System.out.println("Enter the number of Customers:");
		int num = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < num; i++) {
			String customerDetails = sc.nextLine();
			Customer customer = BO.createCustomer(customerDetails);
			customerList.add(customer);
		}

		while (true) {
			System.out.println();
			System.out.println("Enter the search type:");
			System.out.println("1.By name \n2.By birth date \n3.By rating");
			int option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1: {
				System.out.println("Enter the name of the customer to be searched:");
				String customerName = sc.nextLine();
				System.out.println();
				List<Customer> list = BO.findCustomer(customerList, customerName);
				if (list.isEmpty()) {
					System.out.println("No customers found with the given name");
				} else {
					Iterator<Customer> itr = list.iterator();
					while (itr.hasNext()) {
						System.out.print(itr.next() + " ");
						System.out.println();
					}
				}
				break;
			}
			case 2: {
				System.out.println("Enter the birth date of the customer to be searched:");
				String date = sc.nextLine();
				System.out.println();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				Date date1 = sdf.parse(date);
				List<Customer> list = BO.findCustomer(customerList, date1);
				if (list.isEmpty()) {
					System.out.println("No customers found with the given date");
				} else {
					Iterator<Customer> itr = list.iterator();
					while (itr.hasNext()) {
						System.out.println(itr.next() + " ");
						System.out.println();
					}
				}
				break;
			}
			case 3: {
				System.out.println("Enter the rating of the customer to be searched:");
				String Rating = sc.nextLine();
				System.out.println();
				Double rating = Double.parseDouble(Rating);
				List<Customer> list = BO.findCustomer(customerList, rating);
				if (list.isEmpty()) {
					System.out.println("No customers found with the given rating");
				} else {
					Iterator<Customer> it = list.iterator();
					while (it.hasNext()) {
						System.out.print(it.next() + " ");

						System.out.println();
					}
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
