
public class Frog extends Animal{
	
	public Frog(String name, Sex sex, int age){
		super(name, sex, age);
	}
	
	@Override
	public void sound() {
		System.out.println("\nCroak Croak Croak");
	}

}
