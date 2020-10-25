import java.util.Scanner;

public class AddTwoNumbersInputFromUser {
	
	public static void main(String[] args) {
		
		System.out.println("Hello, please enter the first number below");
		Scanner scan1 = new Scanner(System.in);
		int firstNumber = scan1.nextInt();
		
		System.out.println("Now please enter the second number below");
		Scanner scan2 = new Scanner(System.in);
		int secondNumber = scan2.nextInt();
		
		
		System.out.println("Sum of these two numbers is below");
		System.out.println(firstNumber + secondNumber);
		//System.out.println(secondNumber);
		
	}

}
