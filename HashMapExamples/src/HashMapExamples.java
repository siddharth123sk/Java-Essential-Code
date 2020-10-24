import java.util.HashMap;

public class HashMapExamples {
	
	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 3;
//		int c = 44;
//		
//		HashMap<String, Integer> happy = new HashMap<String, Integer>();
//		happy.put("a", 10);
//		happy.put("b", 3);
//		happy.put("c", 44);
//		System.out.println(happy);
//		System.out.println(happy.get("b"));
		
		
		
		HashMap<String, String> fun = new HashMap<String, String>();
		
		fun.put("jaishreeram", "jaisiyaram");
		fun.put("jaibhole", "jaiparvatimaiyya");
		fun.put("jaikrishna", "radheyradhey");
		fun.put("whattt", "howww");
		
		fun.remove("whattt");
		
		System.out.println(fun.containsValue("radheyradhey"));
		
		System.out.println(fun);
		
		System.out.println(fun.keySet());

		
		
		
		
	}

}
