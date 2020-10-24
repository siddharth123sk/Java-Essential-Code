import java.util.ArrayList;

public class Exceptions {
	
	public static void main(String[] args) {
		
		String[] pets = {"dog", "cat", "monkey"};
		
		for (int i = 0; i < 3; i++ ) {
			
			System.out.println(pets[i]);
			
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("book");
		System.out.println(list.get(0));
		
		
		
	}
	
	

}
