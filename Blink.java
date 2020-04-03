package FINAL;
import java.util.Scanner;
public class Blink extends PurchaseMethods{
	public static void main(String[] args) {
	String Temp [] [] = new String [0][0];
	Scanner input = new Scanner(System.in);
	int i;
	int value = 0;
	String  [] [] categories = {
			{"1.Baby","               2.Produce","        3.Meat n Seafood"},
			{"4.Pet Care","           5.Breakfast","      6.Health n Beauty"},
			{"7.Cleaning Supplies","  8.Beverages","      9.Canned Goods n Soup"}
	};
	
	System.out.print("Welcome!\n");
	System.out.print("And thank you for coming to, BLINK!\n");
	System.out.println("\nWe are a small establishment, ran via website that distributes\na wide varitey of common goods with qualtiy eco-friendly packaging!\n");
	System.out.println("We are a small business so we ask that your total items don't exceed 5");
	System.out.println("Below are our categories:\n");

	for (i= 0; i<3; i++) {
		for (int j= 0; j<3; j++) {
			System.out.print(categories[i][j]);
		}
		System.out.println("");
	}
	
	getGroceries(value);
	

	
	}

	
}