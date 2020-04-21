package customer_table_booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContactBO {

	public static Customer createCustomer(String line) throws ParseException {
		String[] customerDetails = line.split(",");

		Customer newCustomer = new Customer();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		newCustomer.setId(Long.parseLong(customerDetails[0]));
		newCustomer.setName(customerDetails[1]);
		newCustomer.setMobileNumber(customerDetails[2]);
		newCustomer.setBirthdate(sdf.parse(customerDetails[3]));
		newCustomer.setAverageSpendAmount(Double.parseDouble(customerDetails[4]));
		newCustomer.setTotalAmount(Double.parseDouble(customerDetails[5]));
		newCustomer.setDateEnrolled(sdf.parse(customerDetails[6]));
		newCustomer.setRating(Double.parseDouble(customerDetails[7]));

		return newCustomer;
	}

	public static List<Customer> findCustomer(List<Customer> customerList, String name) {

		List<Customer> typedCustomer = new ArrayList<Customer>();

		for (Customer customer : customerList) {
			if (customer.getName().equals(name)) {
				typedCustomer.add(customer);
			}
		}
		return typedCustomer;
	}

	public static List<Customer> findCustomer(List<Customer> customerList, Date birth) {

		List<Customer> typedCustomer = new ArrayList<Customer>();

		for (Customer customer : customerList) {

			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			String d1 = sdf.format(customer.getBirthdate());
			String d2 = sdf.format(birth);
			if (d1.equals(d2)) {
				typedCustomer.add(customer);
			}
		}
		return typedCustomer;
	}

	public static List<Customer> findCustomer(List<Customer> customerList, Double rating) {

		List<Customer> typedCustomer = new ArrayList<Customer>();

		for (Customer customer : customerList) {
			String d1 = Double.toString(customer.getRating());
			String d2 = Double.toString(rating);
			if (d1.equals(d2)) {
				typedCustomer.add(customer);
			}
		}
		return typedCustomer;
	}

}
