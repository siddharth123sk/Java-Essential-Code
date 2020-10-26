import java.util.Random;

public class RollingDiceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random diceNumber = new Random();
		int diceOutput = diceNumber.nextInt(6) + 1;
		
		for(int i = 0; i<diceOutput; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		System.out.println(diceOutput);

	}

}
