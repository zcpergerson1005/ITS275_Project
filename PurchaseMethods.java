package FINAL;
import java.util.Scanner;
/* FINAL PROJECT
 * Welcome to our Website!
 * class written by Charity Kyler
 */
public class PurchaseMethods {
	static final String [] [] Baby = {			// Organizes the items within the menu, in a 2D String array
			{"1.Diapers","  $" +6.89},
			{"2.Bibs","     $" +2.39},
			{"3.Bottles","  $" +4.99},
			{"4.Pacifier"," $" +5.49},
			{"5.Formula","  $" +14.79}
	};
	
	static final String [] [] Produce = {
			{"1.Apples","  $" +.79},
			{"2.Oranges"," $" +.85},
			{"3.Banana","  $" +.69},
			{"4.Grapes","  $" +.99},
			{"5.Mangos","  $" +1.19}
	};
	
	static final String [] [] Meat = {
			{"1.Chicken"," $"+9.99},
			{"2.Beef","    $"+8.71},
			{"3.Steak","   $"+12.99},
			{"4.Pork","    $"+10.81},
			{"5.Shrimp","  $"+13.54}
	};
	
	static final String [] [] PetCare = {
			{"1.Collar","     $"+4.99},
			{"2.Cat Brush","  $"+8.61},
			{"3.Dog Leash","  $"+10.99},
			{"4.Dog Toy","    $"+3.79},
			{"5.Cat Litter"," $"+15.99}
	};
	
	static final String [] [] Breakfast = {
			{"1.Cereal","        $"+5.60},
			{"2.Oatmeal","       $"+4.39},
			{"3.Breakfast Bar"," $"+3.49},
			{"4.Yogurt","        $"+3.99},
			{"5.Pop Tarts","     $"+4.29}
	};
	
	static final String [] [] Health = {
			{"1.Face Mask","  $"+1.67},
			{"2.Brush","      $"+4.90},
			{"3.Toothbrush"," $"+3.93},
			{"4.Lotion","     $"+5.56},
			{"5.Chapstick","  $"+1.43}
	};
	
	static final String [] [] CleaningSupplies = {
			{"1.Broom","        $"+7.39},
			{"2.Mop","          $"+8.49},
			{"3.Trash Bags", "  $"+7.65},
			{"4.Toliet Paper"," $"+6.99},
			{"5.Paper Towels"," $"+7.21}
	};
	
	static final String [] [] Beverages = {
			{"1.Water","        $"+3.49},
			{"2.Orange Juice"," $"+3.74},
			{"3.Tea","          $"+3.63},
			{"4.Lemonade","     $"+3.99},
			{"5.Grape Soda","   $"+3.90}
	};

	static final String [] [] CannedGoods = {
			{"1.Beans","        $"+2.99},
			{"2.Chicken Soup"," $"+2.59},
			{"3.Tomato Soup","  $"+2.79},
			{"4.Chilli","       $"+3.21},
			{"5.Corn","         $"+2.90}
	};
	

	public static void list(int selection, String [] [] Baby, String [] [] Produce, String [] [] Meat, String [] [] PetCare, String [] [] Breakfast,
			String [] [] Health, String [] [] CleaningSupplies, String [] [] Beverages, String [] [] CannedGoods){	
		switch (selection) {									// Prints the items within the Menu in a structured format
		case 1: 
			for (int i = 0; i < Baby.length; i++) { 
				for (int j = 0; j < 2; j++) {
				System.out.print(Baby[i][j]);	
				}
				System.out.println("");
			}
			break;
		case 2:
			for (int i = 0; i < Produce.length; i++) { 
				for (int j = 0; j < 2; j++) {
				System.out.print(Produce[i][j]);	
				}
				System.out.println("");
			}
			break;
		case 3:
			for (int i = 0; i < Meat.length; i++) { 
				for (int j = 0; j < 2; j++) {
				System.out.print(Meat[i][j]);	
				}
				System.out.println("");
			}
			break;
		case 4: 
			for (int i = 0; i < PetCare.length; i++) { 
				for (int j = 0; j < 2; j++) {
				System.out.print(PetCare[i][j]);	
				}
				System.out.println("");
			}
			break;
		case 5:
			for (int i = 0; i < Breakfast.length; i++) { 
				for (int j = 0; j < 2; j++) {
				System.out.print(Breakfast[i][j]);	
				}
				System.out.println("");
			}
			break;
		case 6:
			for (int i = 0; i < Health.length; i++) { 
				for (int j = 0; j < 2; j++) {
				System.out.print(Health[i][j]);	
				}
				System.out.println("");
			}
			break;
		case 7:
			for (int i = 0; i < CleaningSupplies.length; i++) { 
				for (int j = 0; j < 2; j++) {
				System.out.print(CleaningSupplies[i][j]);	
				}
				System.out.println("");
			}
			break;
		case 8:
			for (int i = 0; i < Beverages.length; i++) { 
				for (int j = 0; j < 2; j++) {
				System.out.print(Beverages[i][j]);	
				}
				System.out.println("");
			}
			break;
		case 9:
			for (int i = 0; i < CannedGoods.length; i++) { 
				for (int j = 0; j < 2; j++) {
				System.out.print(CannedGoods[i][j]);	
				}
				System.out.println("");
			}
		default:
			System.out.println("Please select one of our options.");
		}
	}
	
	public static String getGroceries(int value) {										//Prints a message to ask for confirmation of order
		String[][] x = null;
		Scanner input = new Scanner(System.in);
		System.out.println("\nPlease enter the numerical value of your choice:");
			value = input.nextInt();
	
		list(value, Baby, Produce, Meat, PetCare, Breakfast, Health, CleaningSupplies, Beverages, CannedGoods);
		System.out.println("\nPlease type which item you would like to buy:");
			int item = input.nextInt();
			if (value == 1) {
				x = Baby;
				System.out.print("Just to confirm, " + x[item - 1][0].substring(2) + " for" + x[item -1][1] + "?");
				return x[item -1][1];
			} else if (value == 2) {
				x = Produce;
				System.out.print("Just to confirm, " + x[item - 1][0].substring(2) + " for" + x[item -1][1] + "? (Yes or No)");
				return x[item -1][1];
			} else if (value == 3) {
				x = Meat;
				System.out.print("Just to confirm, " + x[item - 1][0].substring(2) + " for" + x[item -1][1] + "? (Yes or No)");
				return x[item -1][1];
			} else if (value == 4) {
				x = PetCare;
				System.out.print("Just to confirm, " + x[item - 1][0].substring(2) + " for" + x[item -1][1] + "? (Yes or No)");
				return x[item -1][1];
			} else if (value == 5) {
				x = Breakfast;
				System.out.print("Just to confirm, " + x[item - 1][0].substring(2) + " for" + x[item -1][1] + "? (Yes or No)");
				return x[item -1][1];
			} else if (value == 6) {
				x = Health;
				System.out.print("Just to confirm, " + x[item - 1][0].substring(2) + " for" + x[item -1][1] + "? (Yes or No)");
				return x[item -1][1];
			} else if (value == 7) {
				x = CleaningSupplies;
				System.out.print("Just to confirm, " + x[item - 1][0].substring(2) + " for" + x[item -1][1] + "? (Yes or No)");
				return x[item -1][1];
			} else if (value == 8) {
				x = Beverages;
				System.out.print("Just to confirm, " + x[item - 1][0].substring(2) + " for" + x[item -1][1] + "? (Yes or No)");
				return x[item -1][1];
			} else if (value == 9) {
				x = CannedGoods;
				System.out.print("Just to confirm, " + x[item - 1][0].substring(2) + " for" + x[item -1][1] + "? (Yes or No)");
				return x[item -1][1];
			}
			return null;
			
			
	
	}
	
	
			abstract class Data extends Blink{										// abstract class for data filled
				private String name;
				private String date;
				private String item;
				private int value;
				private int quantity;
				
				protected Data() {
					this("Bob", "14/04/2020", "Diapers", 3.99, 2);
				}

				public Data(Object string, Object string2, Object string3, double d, int i) {
				}
				

				
		
			}


}
