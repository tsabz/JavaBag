
public class ClothingBoutique {

	public static void main(String[] args) {
		System.out.println("program started");
//		Initializes array and adds clothing items to the bag
		BagInterface<Item>bagObject = new ClothingBag<>(); 
		Item[] ItemArray = new Item[20];
		ItemArray[0] = new Item("Red T-Shirt", 29.99);
		ItemArray[1] = new Item("LV", 500.00);
		ItemArray[2] = new Item("LV", 500.00);
		ItemArray[3] = new Item("LV", 500.00);
		ItemArray[4] = new Item("LV", 500.00);
		ItemArray[5] = new Item("LV", 500.00);
		ItemArray[6] = new Item("LV", 500.00);
		ItemArray[7] = new Item("LV", 500.00);
		ItemArray[8] = new Item("LV", 500.00);
		ItemArray[9] = new Item("LV", 500.00);
		ItemArray[10] = new Item("LV", 500.00);
		ItemArray[11] = new Item("LV", 500.00);

		//		test
		System.out.println(ItemArray[0]);
		testAdd(bagObject, ItemArray);
		displayBag(bagObject);
	}
	
	private static void testAdd(BagInterface<Item>adtBag, Item[]ItemArray) {
		System.out.println("***********************");
		System.out.println("Test Add");
		for (int i = 0; i < ItemArray.length; i++) {
			if(adtBag.add(ItemArray[i])) {
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
