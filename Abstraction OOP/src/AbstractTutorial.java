interface DogInterface{
	void bark();
	void poop();
}



abstract class Dog{
	
	String breed;
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	public abstract void poop();
}



class Chihuahua extends Dog{
	
	public void poop() {
		System.out.println("Dog pooped!");
	}
	
}




public class AbstractTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dog d = new Dog();
		
		//d.bark();
		
		Chihuahua c = new Chihuahua();
		
		c.bark();
		c.poop();

	}

}
