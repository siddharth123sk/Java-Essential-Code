import java.util.ArrayList;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findPrimeNumber(17));
		
		

	}
	
	public static boolean findPrimeNumber(int end){
		int count = 0;
		
		boolean isPrime = false;
		
		
		for (int i = 1; i < end/2; i++) {
			if (end%i == 0) {
				
				count++;
				
			}
			
		}
		
		if (count <= 2) {
			isPrime = true;
		}
		
		return isPrime;
		
		}
	
	}