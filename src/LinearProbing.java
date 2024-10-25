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
		return (key % maxSize);
		// Implement getHashIndex here
	}
	
	//method to implement linear probing
	public void probe(int index, int key){
		if (index == currentSize) {
			System.out.println("hash table full");
			return;
		}
		
		while (hashTable[index] != null) {
            cost++;
            index = (index + 1) % maxSize;

        }
        hashTable[index] = key;
        currentSize++;

		// Implement linear probing here
	}

	// public void display( ) {
	// 	// for (int i= 0; i <maxSize; i++){
	// 	// 	System.out.println(hashTable[i]);
	// 	// }
	// 	System.out.println(hashTable.length);
		
	// }
}