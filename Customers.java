package FINAL;
import java.util.Scanner;

public abstract class Customers extends Blink {	 
	protected Customers(String customerName, String customerAddress, String customerZip, String customerState){ 		//protected so can still be used by subclasses
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerZip = customerZip;
		this.customerState = customerState;
	}
	
	static String customerName;
	static String customerAddress;
	static String customerZip;
	static String customerState;
	
	private void setName(String name) {		//encapsulation- personal data should be private
		String customerName = name;
	}
	public String getName() {		//get method to retrieve private data(name)
		return customerName; 
	}
	private void setAddress(String address) {
		String customerAddress = address;
	}
	public String getAddress() {
		return customerAddress;				//method to retrieve address
	}
	
	private void setZip(String zip) {
		String customerZip = zip;
	}
	public String getZip() {
		return customerZip;				//method to retrieve zip code
	}	
	public void setState(String state) {
		String customerState = state;
	}
	public String getState() {
		return customerState;
	}
	
	public abstract void getCard(); 	//abstract method used to get card information
}
