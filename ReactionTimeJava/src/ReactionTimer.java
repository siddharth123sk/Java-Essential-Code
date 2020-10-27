import java.util.Scanner;

public class ReactionTimer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		
		
		System.out.println("GO!");
		long startTime = System.currentTimeMillis();
		
		
		Scanner input = new Scanner(System.in);
		
		input.next()
;
		long stopTime = System.currentTimeMillis();
		
		long reactionTime = stopTime - startTime;
		
		System.out.println(reactionTime + "ms");
	}

}
