
public class ClothingBoutique {

	public static void main(String[] args) {
		System.out.println("program started");
//		Initializes array and adds clothing items to the bag
		BagInterface<Item>bagObject = new ClothingBag<>(); 
		Item[] ItemArray = new Item[20];

		// check if bag is empty before adding 
		isEmpty(bagObject, ItemArray);
		
		ItemArray[0] = new Item("Red T-Shirt", 29.99);
		ItemArray[1] = new Item("LV", 500.00);
		ItemArray[3] = new Item("Sweater", 200.00);
		ItemArray[4] = new Item("Pants", 50.00);
		ItemArray[5] = new Item("Jersey", 90.00);
		ItemArray[6] = new Item("Underwear", 35.00);
		ItemArray[7] = new Item("socks", 20.00);
		ItemArray[8] = new Item("Sweat-pants", 75.00);
		ItemArray[9] = new Item("Shorts", 200.00);
		ItemArray[10] = new Item("hat", 200.00);

		//		test
		System.out.println(ItemArray[0]);
		// calling testAdd
		testAdd(bagObject, ItemArray);

		// calling displayBag
		displayBag(bagObject);
		
		// check if bag is empty before after adding
		isEmpty(bagObject, ItemArray);
		
		clear(bagObject, ItemArray);
		
		isEmpty(bagObject, ItemArray);
	}
	
	private static void clear(BagInterface<Item>bagObject, Item[]ItemArray) {
		System.out.println("***********************");
		System.out.println("Clear All");
		for (int i = 0; i < ItemArray.length; i++) {
				ItemArray[i] = null;
				System.out.println(ItemArray[i]+ " ");
		}
		System.out.println("Cleared!!");
	}
	
	
	private static void isEmpty(BagInterface<Item>bagObject, Item[]ItemArray) {
		System.out.println("***********************");
		System.out.println("Empty");
		
		for (int i = 0; i < ItemArray.length; i++) {
			if (ItemArray[i] == null) {
				System.out.println("Empty!!!");
			} else {
				System.out.println("Not Empty!!!");
			}
			
		}
	}
	
	private static void testAdd(BagInterface<Item>bagObject, Item[]ItemArray) {
		System.out.println("***********************");
		System.out.println("Test Add");
		for (int i = 0; i < ItemArray.length; i++) {
			if(bagObject.add(ItemArray[i])) {
				System.out.println(ItemArray[i]+ " ");
			} else {
				System.out.println("Error");
			}
		}
	}
	
	private static void displayBag(BagInterface<Item>bagObject) {
		System.out.println("***********************");
		System.out.println("Displays all bag items");
		
		Object[]clothingBagArray = bagObject.toArray();
		for(int i = 0; i < clothingBagArray.length; i++) {
			System.out.print(clothingBagArray[i] + "\n");
		}
	}

}
