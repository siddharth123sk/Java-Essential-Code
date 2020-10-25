import java.util.Scanner;

public class PatternsNestedLoopDiamond {

	public static void main(String[] args) {
		
		System.out.println("Hello, please enter an integer for the diamond pattern");
		Scanner scan = new Scanner(System.in);
		int numOfStars = scan.nextInt();
		
		
		
		
		
		// TODO Auto-generated method stub
		
		
//		*
//		**
//		***
//		****
//		***
//		**
//		*
		
		for(int i = 0; i < numOfStars; i ++) {
			
			for(int j = 0; j < i+1; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
		for(int i = numOfStars-1; i > 0; i--) {
			
			for(int j = 0; j < i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
