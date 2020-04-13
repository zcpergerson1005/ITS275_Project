package FINAL;
import java.util.Scanner;

public class Customer1 extends Customers{
	public Customer1(String customerName, String customerAddress, String customerZip, String customerState) {		//call upon the constructor of the superclass, Customer
		super(customerName, customerAddress, customerZip, customerState); }		
	@Override									//method overrides abstract method in superclass to get card information
	public void getCard() {
		System.out.println("Visa Debit Card: 4737 2892 3014 0224\n	Expires: 05/25\n	Security Number: 923");
	}
	
	
	public static void main(String[] args) {
		 
		Customer1 info1 = new Customer1("Mary Sue", "1321 Shell Lane", "49343", "NC");		//customer1 object(name, card info, street)
		
		System.out.println("Customer Database\n");				
		System.out.println("Name: "+info1.getName() );
		info1.getCard();
		System.out.print("Street: "+info1.getAddress() );
		System.out.print(", "+info1.getZip());
		System.out.print(", "+info1.getState());
	}
}
