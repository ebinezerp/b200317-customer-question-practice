package practicedquestion2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		ContactBO BO = new ContactBO();
		System.out.println("Enter the number of customers: ");
		int num = sc.nextInt();
		sc.nextLine();
		List<Customer> customerList = new ArrayList<Customer>();
		for (int i = 0; i < num; i++) {
			String customerDetails = sc.nextLine();
			Customer customer = BO.createCustomer(customerDetails);
			customerList.add(customer);
		}
		while (true) {
			System.out.println("Enter search type");
			System.out.println("1.By name \n2.By birth date \n3.By Rating");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Enter the name of the customer");
				String name = sc.nextLine();
				List<Customer> list = BO.findCustomer(customerList,name);
				if (list.isEmpty()) 
				{
					System.out.println("No customers found with the given name");
				}
				else
				{
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
					Iterator<Customer> itr = list.iterator();
					while (itr.hasNext()) {
						System.out.print(itr.next() + " ");
						System.out.println();
					}
				}
				break;
			}
			default: {
				System.out.println("Invalid choice");
				System.exit(0);
				
			}
			}
		}
	}

	

}
