
public class Item {
	private String name;
	private double price;
	
	// item constructor 
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Getters and Setters
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	@Override 
	public String toString() {
		return this.name + " " + this.price; 
	}
}
