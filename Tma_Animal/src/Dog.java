
public class Dog extends Animal{
	
	public Dog(String name, Sex sex, int age){
		super(name, sex, age);
	}
	
	
	@Override
	public void sound() {
		System.out.println("\nWoof Woof Woof");
	}
	
}
