
public class ClothingBoutique {

	public static void main(String[] args) {
		System.out.println("program started");
//		Initializes array and adds clothing items to the bag
		BagInterface<Item>adtBag = new ClothingBag<>(); 
		Item[] ItemArray = new Item[10];
		ItemArray[0] = new Item("Red T-Shirt", 29.99);
		
		System.out.println(ItemArray[0]);
	}

}
