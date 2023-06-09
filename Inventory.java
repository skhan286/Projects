/**
 * Inventory class with attribute retrieving methods
 * and compareTo method
 */
public class Inventory implements Comparable<Inventory>{
	
	// Inventory attributes
	private String name;
	private double cost;
	private int numberOfItems;
	
	// Initializing attributes using overloaded constructor
	public Inventory(String name, double cost, int numberOfItems) {
		this.name = name;
		this.cost = cost;
		this.numberOfItems = numberOfItems;
	}
	
	// Method to get name
	public String getName() {
		return name;
	}
	
	// Method to get cost
	public double getCost() {
		return cost;
	}
	
	// Method to get number of items
	public int getNumberOfItems() {
		return numberOfItems;
	}
	
	// Method to compare different amounts of certain items
	public int compareTo(Inventory i) {
		return numberOfItems - i.numberOfItems;
	}
	
	// Method to have formatted Inventory results using toString
	public String toString() {
		return "Name: " + name + " Cost: " + cost + " Number of Items: " + numberOfItems;
	}
	
}
