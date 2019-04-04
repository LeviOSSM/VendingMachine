
public class Item implements Vendable {
//four main traits of my Item object.
double Price;
String Name;
String Location;
int Stock;
int newStock = Stock;

int change;

// My constructor for this project. 
public Item(double Amount$, String ID, String Position, int initial_amount) {
	Price = Amount$;
	Name = ID;
	Location = Position;
	Stock = initial_amount;
	
}

// A few Getters and Setters here. 

public String getLocation()
{
	return Location;
}

public void setPrice(double newPrice)
{
	
}

public double getPrice()
{ 
	return Price;
}

public String getName()
{
	return Name;
}

public int getStock()
{
	return Stock;
}

public void addStock(int newStock) {
	Stock = newStock;
}

public boolean canVend()
{
	if(Stock>0) {
	System.out.println("Vended Successfully, stock available.");
	return true;
	}
	else {
	System.out.println("Unavailable to Vend, stock unavailable.");
	return false;
	}
}
public boolean vend() {
	Stock--;
	return true;
}
}
