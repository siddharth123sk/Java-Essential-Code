import java.util.ArrayList;

public class ForEachJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// general for loop
		for(int i = 0; i < 5; i++) {
			System.out.print(i);
			
		}for(int i = 0; i < 5; i++) {
			System.out.println(i);
			
		}
		
		// for each loop
		String[] cars = {"WagonR", "Maruti800", "Fortuner"};
		
		for(String car : cars) {
			System.out.println(car);
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(7);
		numbers.add(17);
		numbers.add(43);
		
		for(int a : numbers) {
			System.out.println(a);
		}
		
	}

}
