
public class Account {
	
	String name;
	int age;
	
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setName("Pankaj");
		a.setAge(25);
		
		System.out.println(a.getName());
		System.out.println(a.getAge());
		
		a.printDetails();
				
	}
	
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int i) {
		this.age = i;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	
	
	public void printDetails() {
		System.out.println(getName() + ", "+ getAge());
	}
}
