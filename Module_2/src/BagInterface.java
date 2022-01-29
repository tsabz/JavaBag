public interface BagInterface<T>
{

    //Gets the current number of entries in this bag.
    public int getCurrentSize();

    // Adds new entry 

    public boolean add(T newEntry);

    // provides an array of the allocated bag. 
   public T[] toArray();
}