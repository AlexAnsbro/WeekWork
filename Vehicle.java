
abstract public class Vehicle {
	private String colour;
	private String make;
	private int numberOfWheels;
	private int numberOfSeats;
	int id = 0;
	
	static int count;
	
	int bill = 0;
	
	public Vehicle (String colour, String make,int numberOfWheels, 	int numberOfSeats )
	{
		this.colour = colour;
		this.make = make;
		this.numberOfWheels = numberOfWheels;
		this.numberOfSeats = numberOfSeats;
		this.id = count;
		count++;
	}
	
	public void putOnSeatbelt()
	{
		System.out.println("You have put on your seatbelt");
	}
	
	public void printBill()
	{
		System.out.println("The Bill is: " + bill);
	}
	
	public void printID() {
		System.out.println(id);
	}
	
	public String toString() {
		return "Vehicle ID: " + id + "\nColour: " + colour + "\nMake: " + make;
		
	}
	
	//getters and setters
	public int getNumOfWheels()   {return this.numberOfWheels;}
	public int getnumberOfSeats() {return this.numberOfSeats;}
	public int getId()			  {return this.id;}
	public String getColour()     {return this.colour;}
	public String getMake()		  {return this.make;}
}
