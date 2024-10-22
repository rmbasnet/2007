//*************************************************************************
//***You must use all the given methods without changing their signature.** 
//***However, you may add new methods using the given ones if necessary.***
//*************************************************************************
public class LinearProbing {
	private static int currentSize = 0;
	private static int cost = 0;
	private int maxSize;
	private Integer[] hashTable;

	public LinearProbing(int maxSize){
		this.maxSize = maxSize;
		this.hashTable = new Integer[this.maxSize];
	}
	
	public int getCost() {
		return this.cost;
	}
	
	//method to implement getHashIndex
	public int getHashIndex(int key){
		return (key % maxSize + maxSize) % maxSize;
		// Implement getHashIndex here
	}
	
	//method to implement linear probing
	public void probe(int index, int key){
		int temp = index;
		if(hashTable[index] != null){
			cost++;
			index = (index + 1) % maxSize;
			if(index == temp){
				System.out.println("hash table full");
			}
		}
		hashTable[index] = key;
		currentSize++;
		// Implement linear probing here
	}
}