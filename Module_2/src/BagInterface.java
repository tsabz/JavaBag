public interface BagInterface<T>
{

   //Gets the current number of entries in this bag.
	
   public int getCurrentSize();

   // Adds new entry 

   public boolean add(T newEntry);
    
   // Clear all

   public void clear();
   
	//checks if bag is empty
	public boolean isEmpty();

   // provides an array of the allocated bag. 
   
   public T[] toArray();
}