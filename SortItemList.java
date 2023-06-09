/**
 * SortItemList driver class for creating Inventory array
 * and calling sorting methods
 */
public class SortItemList {

	public static void main(String[] args) {
		
		// Initializing itemList array and adding 5 item objects
		Inventory[] itemList = new Inventory[5];
		itemList[0] = new Inventory("Eggs", 2.9, 3);
		itemList[1] = new Inventory("Milk", 4.3, 2);
		itemList[2] = new Inventory("Video Game", 59.99, 5);
		itemList[3] = new Inventory("Ice Cream Cake", 35, 1);
		itemList[4] = new Inventory("Beef", 15, 4);
		
		// Printing Inventory and number of items before Sorting
		System.out.println("Before any Sorting: ");
		Sorting.printInventory(itemList);
		Sorting.numItems(itemList);
		
		// Doing selection sort on itemList
		System.out.println("After Selection Sort: ");
		Sorting.selectionSort(itemList);
		
		// Doing insertion sort on itemList
		System.out.println("After Insertion Sort: ");
		Sorting.insertionSort(itemList);
		
		// Doing bubble sort on itemList
		System.out.println("After Bubble Sort: ");
		Sorting.bubbleSort(itemList);
		
		// Doing quick sort on itemList
		System.out.println("After Quick Sort: ");
		Sorting.quickSort(itemList);
		
		// Doing merge sort on itemList
		System.out.println("After Merge Sort: ");
		Sorting.mergeSort(itemList);
		
	}

}
