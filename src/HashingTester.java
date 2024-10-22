//*************************************************************************
//***You must use all the given methods without changing their signature.** 
//***However, you may add new methods using the given ones if necessary.***
//*************************************************************************
import java.util.Random;
import java.util.Scanner;

public class HashingTester {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter load factor (lambda) between 0.1 and 0.9: ");
		double lambda = scan.nextDouble();
		
		double size = Double.valueOf(10000)/lambda;
		
		int hashTableSize = findTheNextPrime((int)size);
		
		System.out.print("Enter probe type (1 for linear, 2 for quadratic): ");
		int probeType = scan.nextInt();
		
		int[] randomIntegers = generateRandomIntegers(probeType, hashTableSize, lambda);
	}
	
	// method to find the next prime integer
	public static int findTheNextPrime (int N) {
		while(!isPrime(N)){
			N++;
		}
		return N;
		// Implement checkMove here
		//*********The error will go away once you implement and returns an int value*********
	}

	public static boolean isPrime(int N){
		if(N <= 1) return false;
		for (int i = 2; i <= Math.sqrt(N); i++){
			if(N % i == 0){
				return false;
			}
		}
		return true;
	}
	
	// method to find the next prime integer
	public static int[] generateRandomIntegers (int probeType, int hashTableSize, double lambda) {
		int[] theArray = new int [hashTableSize];
    	
    	Random r = new Random();
    	int low = 1;
    	int high = hashTableSize;
    	
		if(probeType == 1){
			LinearProbing lProbing = new LinearProbing(hashTableSize);
			
			for(int j = 0; j<10000; j++) {
				//inputting random value to an array
				lProbing.getHashIndex(r.nextInt(high-low) + low);
	    	}
			System.out.println("Actual (average) cost: "+lProbing.getCost()/Double.valueOf(10000));
			// call linearExpectedNoOfProbes(lambda);
		}
			
		else if(probeType == 2){
			// repeat the exact above steps for the quadratic probing
		}
//			
		return theArray;
    }
	
	public static void linearExpectedNoOfProbes(double lambda) {
		double epCost = 0.5*(1.0+(1.0/(1.0-lambda)));
		System.out.println("Expected cost (from the equation): "+String.format("%,.4f", epCost));
	}
	
	// public static void quadraticExpectedNoOfProbes(double lambda) {
	// 	//double epCost = repeat the above step for the quadratic probing;
	// 	//*********The error will go away once you implement epCost*********
	// 	System.out.println("Expected cost (from the equation): "+String.format("%,.4f", epCost));
	// }
}