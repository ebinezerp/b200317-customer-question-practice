import java.text.PasreException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Date;


public class MainContactBO{
    public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		
		ContactBO BO = new ContactBO();
		List<Customer> customerList = new ArrayList();
		
		System.out.println("Enter the number of Customers: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<num; i++){
			String customerDetails = sc.nextLine();
			Customer customer = BO.creatCustomer(customerDetails);
			customerList.add(customer);	
		}
		while (true) {
			System.out.println();
			System.out.println("Enter the search type: ");
			System.out.println("1. By name \n2.By birthdate \n3. By rating");
			int option = sc.nextInt();
			sc.nextLine();
			
			switch (option){
				case 1: {
					System.out.println("Enter the name of the customer to be searched:");
					System.out.println();
					List<Customer> list= BO.findCustomer(customerList, customerName);
					if (list.isEmpty()){
						System.out.printin("No customers found with the given name:" );
					}else{
						Iterator<customer> itr = list.iterator();
						while (itr.hasNext()){
							System.out.println(itr.next()+ " ");
							System.out.println();
						}
						
					}	
						break;
					}
				case 2: {
					System.out.println("Enter the birthdate of the customer to be searched:");
					System.out.println();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					Date date = sdf.parse(date);
					List<customer> list = BO.findCustomer(customerList, date);
					
					if(list.isEmpty()){
						System.out.println("No customers found with the given date:");
					}else{
						Iterator<customer> itr = list.Iterator();
						while(itr.hasNext()){
							System.out.println(itr.next()+ " ");
							System.out.println();
						}
					}	
						break;
					}
				case 3: {
					System.out.println("Enter the rating of the customer to be searched:");
					System.out.println();
					List<customer> list = BO.findCustomer(customerList,customerRating);
					if(list.isEmpty()){
						System.out.println("No customers found with the given rating:");
					}else{
						Iterator<customer> itr = list.iterator();
						while (itr.hasNext()){
							System.out.println(itr.next()+" ");
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