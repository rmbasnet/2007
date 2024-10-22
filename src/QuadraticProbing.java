//*************************************************************************
//***You must use all the given methods without changing their signature.** 
//***However, you may add new methods using the given ones if necessary.***
//*************************************************************************
public class QuadraticProbing {
	private static int currentSize = 0;
	private static int cost = 0;
	private int maxSize;
	private Integer[] hashTable;

	public QuadraticProbing(int maxSize){
		this.maxSize = maxSize;
		this.hashTable = new Integer[this.maxSize];
	}
	
	public int getCost() {
		return this.cost;
	}
	
	//method to implement getHashIndex
	public void getHashIndex(int key){
		// Implement getHashIndex here
	}
	
	//method to implement quadratic probing
	public void probe(int index, int key){
		// Implement quadratic probing here
	}
}