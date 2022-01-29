 
public class ClothingBag<T> implements BagInterface<T>
 {
	private final T[] bag;
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY = 10;
	
	
	public ClothingBag() {
		this(DEFAULT_CAPACITY);
	}
	public ClothingBag(int defaultCapacity) {
		T[] tempBag = (T[])new Object[DEFAULT_CAPACITY];
		bag = tempBag;
		this.numberOfEntries = 0;
		
	}
	
	@Override
	public int getCurrentSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean add(T newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	} 
	 
 }