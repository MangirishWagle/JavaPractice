package JavaDataTypes;

class Animal {
	
	public String dog;
	public String cat;

	Animal(String dog, String cat) {
		this.dog = dog;
		this.cat = cat;
	}
	
	public void catSound() {
		System.out.println("Cat does Mew!");
	}
	
	public void dogSound() {
		System.out.println("Dog does woof! woof!");
	}
}

public class ClassExample {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal("","");
		animal.dogSound();
		animal.catSound();
		
	}

}
