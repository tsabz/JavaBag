 
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
		
		if (isArrayFull()) {
			return false;
		} else {
			bag[numberOfEntries] = newEntry;
			numberOfEntries++;
			return true;
		}
		
	}

	@Override
	public T[] toArray() {
		
		T[] output = (T[])new Object[numberOfEntries];
		for (int i = 0; i < numberOfEntries; i++) {
			output[i] = bag[i];
		}
		return output;
	} 
	
	private boolean isArrayFull() {
		if (numberOfEntries >= bag.length) {
			return true;
		} else {
			return false;
		}
	}
	 
 }