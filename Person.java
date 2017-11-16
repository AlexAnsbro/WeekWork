
public class Person {
	
	private String name;
	private int age;
	private String occupation;

	
	
	public Person(String name, int age, String occupation) {
		super();
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + name + "\n Age: " + age + "\n Job: " + occupation;
	}
	
	
	
	

}
