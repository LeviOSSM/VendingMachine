import java.util.Scanner;
public class Vending_Machine{

public static void main(String[] args)
{ 
	//The "Some_Location" one is how the user is going to select the item(in my code at least).
	String Some_Location;
	double Available_Money;
	int newStock;
	String Response, Answer, Answer_for_SecurityCode, Answer_for_RestockItem;
	Scanner User_Input_Selection = new Scanner(System.in);
	Scanner User_Input_Money = new Scanner(System.in);
	Scanner User_Would_Continue = new Scanner(System.in);
	Scanner User_Would_Restock = new Scanner(System.in);
	// These are the different kind of "items" in my vending machine. They possess four main attributes.
		// They have a Price, Name, Location, and an Amount Remaining.
		Item Chips1 = new Item(1.50, "Pringles", "A0", 8);
		Item Chips2 = new Item(1.25, "Doritos", "A1", 8);
		Item Chips3 = new Item(1.00, "Cheetos", "A2", 8);
		Item Candy1 = new Item(2.00, "Snickers King Size","B0", 8);
		Item Candy2 = new Item(1.75, "White Chocolate Kit Kat","B1", 8);
		Item Candy3 = new Item(1.50, "Hershey's Bar", "B2", 8);
		Item Drink1 = new Item(1.75, "Sprite", "C0", 8);
		Item Drink2 = new Item(2.00, "Dr.Pepper", "C1", 8);
		Item Drink3 = new Item(2.75, "Peace Tea", "C2", 8);
		
		// the array to store my objects(items), im not really sure what I am going to do with it though.
		Item[] items =
			{
					Chips1, Chips2, Chips3, Candy1, Candy2, Candy3, Drink1, Drink2, Drink3
			};
	do
	{
		
	System.out.println("Restocking?(Yes or No): ");
	Answer = User_Would_Restock.nextLine();
	if(Answer.equalsIgnoreCase("yes")) {
		// Professor Jones, the Security code is 01123
		System.out.println("Please enter the 5 digit security code: ");
		Answer_for_SecurityCode = User_Would_Restock.nextLine();
		if(Answer_for_SecurityCode.equalsIgnoreCase("01123")){
		System.out.println("Which item will you be restocking(Chips1, Drink3, Candy2, etc...): ");
		Answer_for_RestockItem = User_Would_Restock.nextLine();
		switch(Answer_for_RestockItem) {
		
		case "Chips1":
			System.out.println("Please enter the amount of inventory after you have Stocked: ");
			newStock = User_Would_Restock.nextInt();
			Chips1.addStock(newStock);
			break;
		case "Chips2":
			System.out.println("Please enter the amount of inventory after you have Stocked: ");
			newStock = User_Would_Restock.nextInt();
			Chips2.addStock(newStock);
			break;
		
		
		case "Chips3":
			System.out.println("Please enter the amount of inventory after you have Stocked: ");
			newStock = User_Would_Restock.nextInt();
			Chips3.addStock(newStock);
			break;
		
		case "Candy1":
			System.out.println("Please enter the amount of inventory after you have Stocked: ");
			newStock = User_Would_Restock.nextInt();
			Candy1.addStock(newStock);
			break;
		
		case "Candy2":
			System.out.println("Please enter the amount of inventory after you have Stocked: ");
			newStock = User_Would_Restock.nextInt();
			Candy2.addStock(newStock);
			break;
		
		case "Candy3":
			System.out.println("Please enter the amount of inventory after you have Stocked: ");
			newStock = User_Would_Restock.nextInt();
			Candy3.addStock(newStock);
			break;
		
		case "Drink1":
			System.out.println("Please enter the amount of inventory after you have Stocked: ");
			newStock = User_Would_Restock.nextInt();
			Drink1.addStock(newStock);
			break;
			
		case "Drink2":
			System.out.println("Please enter the amount of inventory after you have Stocked: ");
			newStock = User_Would_Restock.nextInt();
			Drink2.addStock(newStock);
			break;
			
		case "Drink3":
			System.out.println("Please enter the amount of inventory after you have Stocked: ");
			newStock = User_Would_Restock.nextInt();
			Drink3.addStock(newStock);
			break;
		}
		
		}
		
		}
	
	else {
	System.out.println("Then please continue with your purchase!");
	
	
	
	System.out.println("Please enter currency: ");
	Available_Money = User_Input_Money.nextDouble();
	
	System.out.println("Please enter the index of your desired Item: " );
	Some_Location = User_Input_Selection.nextLine();
	
	
	
	//Basically, this is going to be the "meat" of my code.(Next Line)
	//This is where the user can actually select what they want.
	switch(Some_Location)
	{
	
	case "A0":
		if(Chips1.canVend() == true){
			Chips1.vend();
		{
		if(Available_Money - Chips1.getPrice() >= 0) {
			if(Chips1.getStock() >= 1) {
			System.out.println("Purchase of " + Chips1.getName() + " Successful");
			System.out.println("Change: " + (Available_Money - Chips1.getPrice()));
			System.out.println( Chips1.getName() +  " Remaining: " + Chips1.getStock());
			}
		}
			else {
				System.out.println("Insufficent amount of Currency, please enter a greater amount.");
			}
			break;}
		}
			else {
			System.out.println("No Stock Available.");
			break;
			}
		
		
	case "A1":
		if(Chips2.canVend() == true){
			Chips2.vend();
		{
		if(Available_Money - Chips2.getPrice() >= 0) {
			if(Chips2.getStock() >= 1) {
			System.out.println("Purchase of " + Chips2.getName() + " Successful");
			System.out.println("Change: " + (Available_Money - Chips2.getPrice()));
			System.out.println( Chips2.getName() +  " Remaining: " + Chips2.getStock());
			}
		}
			else {
				System.out.println("Insufficent amount of Currency, please enter a greater amount.");
			}
			break;}
		}
			else {
			System.out.println("No Stock Available.");
			break;}
		
	case "A2":
		if(Chips3.canVend() == true){
			Chips3.vend();
		{
		if(Available_Money - Chips3.getPrice() >= 0) {
			if(Chips3.getStock() >= 1) {
			System.out.println("Purchase of " + Chips3.getName() + " Successful");
			System.out.println("Change: " + (Available_Money - Chips3.getPrice()));
			System.out.println( Chips3.getName() +  " Remaining: " + Chips3.getStock());
			}
		}
			else {
				System.out.println("Insufficent amount of Currency, please enter a greater amount.");
			}
			break;}
		}
			else {
			System.out.println("No Stock Available.");
			break;}
		
	case "B0":
		if(Candy1.canVend() == true){
			Candy1.vend();
		{
		if(Available_Money - Candy1.getPrice() >= 0) {
			if(Candy1.getStock() >= 1) {
			System.out.println("Purchase of " + Candy1.getName() + " Successful");
			System.out.println("Change: " + (Available_Money - Candy1.getPrice()));
			System.out.println( Candy1.getName() +  " Remaining: " + Candy1.getStock());
			}
		}
			else {
				System.out.println("Insufficent amount of Currency, please enter a greater amount.");
			}
			break;}
		}
			else {
			System.out.println("No Stock Available.");
			break;}
		
	case "B1":
		if(Candy2.canVend() == true){
			Candy2.vend();
		{
		if(Available_Money - Candy2.getPrice() >= 0) {
			if(Candy2.getStock() >= 1) {
			System.out.println("Purchase of " + Candy2.getName() + " Successful");
			System.out.println("Change: " + (Available_Money - Candy2.getPrice()));
			System.out.println( Candy2.getName() +  " Remaining: " + Candy2.getStock());
			}
		}
			else {
				System.out.println("Insufficent amount of Currency, please enter a greater amount.");
			}
			break;}
		}
			else {
			System.out.println("No Stock Available.");
			break;}
		
	case "B2":
		if(Candy3.canVend() == true){
			Candy3.vend();
		{
		if(Available_Money - Candy3.getPrice() >= 0) {
			if(Candy3.getStock() >= 1) {
			System.out.println("Purchase of " + Candy3.getName() + " Successful");
			System.out.println("Change: " + (Available_Money - Candy3.getPrice()));
			System.out.println( Candy3.getName() +  " Remaining: " + Candy3.getStock());
			}
		}
			else {
				System.out.println("Insufficent amount of Currency, please enter a greater amount.");
			}
			break;}
		}
			else {
			System.out.println("No Stock Available.");
			break;}
		
	case "C0":
		if(Drink1.canVend() == true){
			Drink1.vend();
		{
		if(Available_Money - Drink1.getPrice() >= 0) {
			if(Chips1.getStock() >= 1) {
			System.out.println("Purchase of " + Drink1.getName() + " Successful");
			System.out.println("Change: " + (Available_Money - Drink1.getPrice()));
			System.out.println( Drink1.getName() +  " Remaining: " + Drink1.getStock());
			}
		}
			else {
				System.out.println("Insufficent amount of Currency, please enter a greater amount.");
			}
			break;}
		}
			else {
			System.out.println("No Stock Available.");
			break;}
		
	case "C1":
		if(Drink2.canVend() == true){
			Drink2.vend();
		{
		if(Available_Money - Drink2.getPrice() >= 0) {
			if(Drink2.getStock() >= 1) {
			System.out.println("Purchase of " + Drink2.getName() + " Successful");
			System.out.println("Change: " + (Available_Money - Drink2.getPrice()));
			System.out.println( Drink2.getName() +  " Remaining: " + Drink2.getStock());
			}
		}
			else {
				System.out.println("Insufficent amount of Currency, please enter a greater amount.");
			}
			break;}
		}
			else {
			System.out.println("No Stock Available.");
			break;}
		
	case "C2":
		if(Drink3.canVend() == true){
			Drink3.vend();
		{
		if(Available_Money - Drink3.getPrice() >= 0) {
			if(Drink3.getStock() >= 1) {
			System.out.println("Purchase of " + Drink3.getName() + " Successful");
			System.out.println("Change: " + (Available_Money - Drink3.getPrice()));
			System.out.println( Drink3.getName() +  " Remaining: " + Drink3.getStock());
			}
		}
			else {
				System.out.println("Insufficent amount of Currency, please enter a greater amount.");
			}
			break;}
		}
			else {
			System.out.println("No Stock Available.");
			break;}
}
	}
	System.out.println("Would you like to interact with this Vending Machine?(Yes or No) ");
	Response = User_Would_Continue.nextLine();
	
}
while(Response.equalsIgnoreCase("yes"));

	
}
}


