
public class Animal implements Sound{

	protected String Name;
	protected Sex Sex;
	protected int Age;
	
	protected Animal(String name, Sex sex, int age) {
		this.Name = name;
		this.Sex = sex;
		this.Age = age;
	}
	
	@Override
	public void sound() {	
		
	}
	
	@Override
	public String toString() {
		return "\tName: " + Name
				+"\n\tSex: " + Sex
				+"\n\tAge: " + Age;
	}

}
