import java.util.Scanner;

public class TryCatchExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {
//		
//		int[] a = {4, 5, 1};
//		System.out.println(a[1]);
//		} catch(Exception e) {
//			
//			System.out.println("An exception happened!");
//			
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your fav number?");
		
		try {
			int n = scan.nextInt();
			System.out.println(n);
			}catch(Exception e) {
				System.out.println("Sorry, please enter a number");
			}

	}

}
