
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String inputString = "race car";
			inputString = inputString.replace(" ", ""); //removing space between characters
			
			String reverse = "";
			
			for(int i = inputString.length()-1; i >= 0; i--) {
				reverse = reverse + inputString.charAt(i);
				System.out.println(reverse);
			}
			
			boolean palindrome = true;
			
			for (int i = inputString.length()-1; i >= 0; i--) {
				
				if(inputString.charAt(i) != reverse.charAt(i)) {
					palindrome = false;
				}
				
			}
			
			if(palindrome) {
				System.out.println("Palindrome!");
			} else {
				System.out.println("Not a palindrome!");
			}
			
	}

}
