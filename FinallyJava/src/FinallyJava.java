import java.util.Scanner;

public class FinallyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Write something here");
		Scanner scan = new Scanner(System.in);
		//System.out.println("So you wrote ");
		//System.out.println(scan.next());
		//scan.close();
		
		try {
			
			//int a = 50/0 ;
			System.out.println(scan.next());
			
		} catch(NullPointerException e) {
			
			System.out.println(e);
			
		} catch(Exception e) {
			
			System.out.println(e);
			
			
		}finally {
			
			//System.out.println("This is in 'finally', it always gets run");
			scan.close();
			
		}
		

	}

}
