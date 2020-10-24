import java.util.HashSet;
import java.util.Iterator;

public class HashsetJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h = new HashSet<String>();
		
		h.add("pug");
		h.add("chihuahua");
		h.add("retreiver");
		h.add("husky");
		
		System.out.println(h);
		
		System.out.println(h.contains("chihuahua"));
		
		h.remove("chihuahua");
		
		System.out.println(h.size());
		
		System.out.println(h);
		
		h.clear();
		System.out.println(h);
		
		boolean t = h.isEmpty();
		System.out.println(t);
		
		
		HashSet<Integer> hashbrowns = new HashSet<Integer>();
		hashbrowns.add(13);
		hashbrowns.add(24);
		hashbrowns.add(55);
		
		
		System.out.println(hashbrowns);
		
		System.out.println(hashbrowns.toArray());
		
		Object [] v = hashbrowns.toArray();
		System.out.println(v[0]);
		
		
		System.out.println(hashbrowns.hashCode());
		
		
		Iterator<Integer> it = hashbrowns.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
	}

}
