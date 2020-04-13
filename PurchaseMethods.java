package FINAL;
import java.util.Scanner;

public class PurchaseMethods {
	static String [] [] Baby = {
			{"1.Diapers","  $6.89"},
			{"2.Bibs","     $2.39"},
			{"3.Bottles","  $4.99"},
			{"4.Pacifier"," $5.49"},
			{"5.Formula","  $14.79"}
	};
	
	static String [] [] Produce = {
			{"1.Apples","  $.79"},
			{"2.Oranges"," $.85"},
			{"3.Banana","  $.69"},
			{"4.Grapes","  $.99"},
			{"5.Mangos","  $1.19"}
	};
	
	static String [] [] Meat = {
			{"1.Chicken"," $9.99"},
			{"2.Beef","    $8.70"},
			{"3.Steak","   $12.99"},
			{"4.Pork","    $10.81"},
			{"5.Shrimp","  $13.54"}
	};
	
	static String [] [] PetCare = {
			{"1.Collar","     $4.99"},
			{"2.Cat Brush","  $8.61"},
			{"3.Dog Leash","  $10.99"},
			{"4.Dog Toy","    $3.79"},
			{"5.Cat Litter"," $15.99"}
	};
	
	static String [] [] Breakfast = {
			{"1.Cereal","        $5.60"},
			{"2.Oatmeal","       $4.39"},
			{"3.Breakfast Bar"," $3.49"},
			{"4.Yogurt","        $3.99"},
			{"5.Pop Tarts","     $4.29"}
	};
	
	static String [] [] Health = {
			{"1.Face Mask","  $1.67"},
			{"2.Brush","      $4.90"},
			{"3.Toothbrush"," $3.93"},
			{"4.Lotion","     $5.56"},
			{"5.Chapstick","  $1.43"}
	};
	
	static String [] [] CleaningSupplies = {
			{"1.Broom","        $7.39"},
			{"2.Mop","          $8.49"},
			{"3.Trash Bags", "  $7.65"},
			{"4.Toliet Paper"," $6.99"},
			{"5.Paper Towels"," $7.21"}
	};
	
	static String [] [] Beverages = {
			{"1.Water","        $3.49"},
			{"2.Orange Juice"," $3.74"},
			{"3.Tea","          $3.63"},
			{"4.Lemonade","     $3.99"},
			{"5.Grape Soda","   $3.90"}
	};

	static String [] [] CannedGoods = {
			{"1.Beans","        $2.99"},
			{"2.Chicken Soup"," $2.59"},
			{"3.Tomato Soup","  $2.79"},
			{"4.Chilli","       $3.21"},
			{"5.Corn","         $2.90"}
	};
	

	public static void list(int selection, String [] [] Baby, String [] [] Produce, String [] [] Meat, String [] [] PetCare, String [] [] Breakfast,
			String [] [] Health, String [] [] CleaningSupplies, String [] [] Beverages, String [] [] CannedGoods){
		switch (selection) {
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
	
	public static void getGroceries(int value) {
		String[][] x = null;
		Scanner input = new Scanner(System.in);
		System.out.println("\nPlease enter the numerical value of your choice.");
			value = input.nextInt();
	
		list(value, Baby, Produce, Meat, PetCare, Breakfast, Health, CleaningSupplies, Beverages, CannedGoods);
		System.out.println("\nPlease type which item you would like to buy.");
			int item = input.nextInt();
			if (value == 1) {
				x = Baby;
				System.out.print("Just to confirm, " + x[item - 1][0] + " for" + x[item -1][1] + "?");
			} else if (value == 2) {
				x = Produce;
				System.out.print("Just to confirm, " + x[item - 1][0] + " for" + x[item -1][1] + "?");
			} else if (value == 3) {
				x = Meat;
				System.out.print("Just to confirm, " + x[item - 1][0] + " for" + x[item -1][1] + "?");
			} else if (value == 4) {
				x = PetCare;
				System.out.print("Just to confirm, " + x[item - 1][0] + " for" + x[item -1][1] + "?");
			} else if (value == 5) {
				x = Breakfast;
				System.out.print("Just to confirm, " + x[item - 1][0] + " for" + x[item -1][1] + "?");
			} else if (value == 6) {
				x = Health;
				System.out.print("Just to confirm, " + x[item - 1][0] + " for" + x[item -1][1] + "?");
			} else if (value == 7) {
				x = CleaningSupplies;
				System.out.print("Just to confirm, " + x[item - 1][0] + " for" + x[item -1][1] + "?");
			} else if (value == 8) {
				x = Beverages;
				System.out.print("Just to confirm, " + x[item - 1][0] + " for" + x[item -1][1] + "?");
			} else if (value == 9) {
				x = CannedGoods;
				System.out.print("Just to confirm, " + x[item - 1][0] + " for" + x[item -1][1] + "?");
			}
			
			
	
		/*System.out.println(" How many would you like?");
		int quantity = input.nextInt();
		System.out.print("Are you sure you want to buy " + quantity + "?");
		
		Scanner reInput = new Scanner(System.in); 		//scanner created to use in exception
		boolean reInputCheck = true;
		
		do {															//exception; asks for confirmation of quantity
			try {	String confirmation = input.next("yes");			 
					System.out.println("\nYou have selected yes.");
					reInputCheck = false;								//Improvement - allow user to repeat after catch
		    }					
			catch (InputMismatchException wrongString) {
				System.out.println("\nYou have selected something other than 'yes'. Please either input 'yes' or restart the program.");
				reInput.nextLine();
			}
		}
		while(reInputCheck); 
		
		Date purchase1 = getPurchaseDate();
		System.out.println("You have purchased "+quantity+ " of the item "+x[item - 1][0]+ " on "+purchase1);
	}

	public static Date getPurchaseDate() { 			//gets the purchase date and time (time taken from system time when program runs) 
		Date purchase1 = new Date();
		return purchase1; */
	}
}
