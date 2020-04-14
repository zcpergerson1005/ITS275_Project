package FINAL;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;


/* FINAL PROJECT
 * Welcome to our Website!
 * class written by Charity Kyler
 */
public class Blink extends PurchaseMethods{

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);			// Variables
	int i;
	int value = 0;
	
	String  [] [] categories = {
			{"1.Baby","               2.Produce","        3.Meat n Seafood"},	// Array of the menu
			{"4.Pet Care","           5.Breakfast","      6.Health n Beauty"},
			{"7.Cleaning Supplies","  8.Beverages","      9.Canned Goods n Soup"}
	};
	
	System.out.print("Welcome!\n");										// Guidelines that display in the console
	System.out.print("And thank you for coming to, BLINK!\n");
	System.out.println("\nWe are a small establishment, ran via website that distributes\na wide varitey of common goods with qualtiy eco-friendly packaging!\n");
	System.out.println("We are a small business so we ask that your total items don't exceed 5");
	System.out.println("Below are our categories:\n");

	for (i= 0; i<3; i++) {
		for (int j= 0; j<3; j++) {
			System.out.print(categories[i][j]);						// Prints the Menu in the grid like structure
		}
		System.out.println("");
	}
	
	getGroceries(value);										// Refers to a method that ask for confirmation
	String boolean1 = null;
	String answer = input.next();
	if (answer.startsWith("y")) {
		System.out.println("Would you like anything else? (Yes or No)");
				boolean1 = input.next();
			while (boolean1.startsWith("y")) {						// while loop that is continues until it reaches a no
				for (i= 0; i<3; i++) {
					for (int j= 0; j<3; j++) {
						System.out.print(categories[i][j]);
					}
					System.out.println("");
				}
				getGroceries(value);
				answer = input.next();
				System.out.println("Would you like anything else? (Yes or No)");
				boolean1 = input.next();
			}
	} if (answer.startsWith("n")) {
		System.out.print("Would you like anything else?");
		System.out.print("Thank you for coming for using our services! Your items will be available in 3 to 5 days.");
	}

		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	try {		
																		// Convert String to Data in java
		Date today = sdf.parse("14/04/2020");
		System.out.println("Date is : " + today.toString());
		
																			// using locale
		sdf = new SimpleDateFormat("dd-MM-yyy", Locale.US);
	
		today = new Date();
		System.out.println("Default Date is : " + today.toString());
		
		
	} catch (ParseException e) {
		e.printStackTrace();
		
	}				
	
	}
	
}
