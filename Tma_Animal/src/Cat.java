
public class Cat extends Animal{

	protected Cat(String name, Sex sex, int age) {
		super(name, sex, age);
	}
	
	@Override
	public void sound() {
		System.out.println("\nMeo Meo Meo");
	}

}
