
public class Zoo {
	
	public static void main(String args[]) {
		
//		Animal animal1 = new Animal(12, "M", 23);
//		
//		animal1.eat();
		
		Chicken chick1 = new Chicken(1, "M", 7);
		
		Bird bird1 = new Bird(2, "F", 4);
		
		
		Fish fish1 = new Fish(0, null, 0);
		
		Sparrow sparrow1 = new Sparrow(1, "F", 5);
		
		sparrow1.move();
		
		sparrow1.fly();
		
		///bird1.fly();
		fish1.swim();
		
		fish1.move();
		
		//chick1.fly();
		
		
		Flyable flyingBird1 = new Sparrow(1, "M", 4);
		//Flyable flyingBird2 = new Bird(1, "M", 3);
		
	}

}
