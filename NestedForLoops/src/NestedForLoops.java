
public class NestedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			System.out.println("It's a nice weather!");
		}

		System.out.println("------------");

		String[] colors = { "Pink", "Blue", "Yellow" };

		for (int i = 0; i < 3; i++) {
			System.out.println(colors[i]);
		}

		System.out.println("------------");

		String[][] fancyColors = { { "Pink", "Blue", "Yellow" }, { "Cyan", "Magenta", "Purple" } };
		
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				
				System.out.println(fancyColors[i][j]);
				
			}
		}
		System.out.println("------------");

		
	}

}


