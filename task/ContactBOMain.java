import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ContactBOMain{
   public static void main(String[] args) throws ParseException{
       Scanner sc=new Scanner(System.in);
	   ContactBO cbo=new ContactBO();
	   
	   
	   System.out.println("Enter the number of customers:");
	   
	   
	   int num=sc.nextInt();
	   sc.nextLine();
	   
	   List<Customer> customerList=new ArrayList<Customer>();
	   
	   for(int i=0;i<num;i++){
	      String customerDetails=sc.nextLine();
		  Customer customer=cbo.createCustomer(customerDetails);
		  customerList.add(customer);
	   }
	   
	   while(true){
	                System.out.println("Enter the search type:");
		            System.out.println("1.By name\n2.By birth date\n3.By rating");
                    int choice=sc.nextInt();
		            sc.nextLine();
					System.out.println();
					
			switch(choice){
			    case 1:{
				    System.out.println("Enter the name of the customer to be searched:");
					String name=sc.nextLine();
					System.out.println();
					
					List<Customer> list=cbo.findCustomer(customerList,name);
					if(list.isEmpty()){
					   System.out.println("Customers not found");
					}else{
					    Iterator<Customer> it=list.iterator();
						while(it.hasNext()){
						    System.out.println(it.next()+" ");
							System.out.println();
						}
					}
					break;
					
				}
				case 2:{
					System.out.println("Enter the birt date of the customer to be searched:");
					String date=sc.nextLine();
					System.out.println();
					SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
					
					Date d=sdf.parse(date);
					
					
					List<Customer> list=cbo.findCustomer(customerList,d);
					if(list.isEmpty()){
					   System.out.println("Customers not found");
					}else{
					    Iterator<Customer> it=list.iterator();
						while(it.hasNext()){
						    System.out.println(it.next()+" ");
							System.out.println();
						}
					}
					break;
				    
				}
				case 3:{
					System.out.println("Enter the rating of the customer to be searched:");
					String rating=sc.nextLine();
					System.out.println();
					
					
					
					List<Customer> list=cbo.findCustomer(customerList,rating);
					if(list.isEmpty()){
					   System.out.println("Customers not found");
					}else{
					    Iterator<Customer> it=list.iterator();
						while(it.hasNext()){
						    System.out.println(it.next()+" ");
							System.out.println();
						}
					}
					break;
				     
			}		
             default:{
			     System.exit(0);
			 }				 
	   }
   }
   }
}