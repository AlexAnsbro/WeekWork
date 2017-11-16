
public class People {
	private String name;
	private int age;
	private String jobTitle;
	
	public People (String name, int age, String jobTitle )
	{
		this.name = name;
		this.age  = age;
		this.jobTitle = jobTitle;
	}
	
	public void giveInfo()
	{
		System.out.println("Person Name: " + name);
		System.out.println("Person Age: " + age);
		System.out.println("Person Job Title: " + jobTitle);
	}

	public String toString()
	{
		System.out.println("Person Name: " + name);
		System.out.println("Person Age: " + age);
		System.out.println("Person Job Title: " + jobTitle);
		return "Jeff";
	}
	
	
	public String getName() {
		return this.name;
	}
}
