
public class Motorcycle extends Vehicle {

	public Motorcycle(String colour, String make, int numberOfWheels, int numberOfSeats) {
		super(colour, make, numberOfWheels, numberOfSeats);
		
	}
	
	public void joinHellsAngels()
	{
		System.out.println("You have joined the Hells Angels");
	}
	
	public void honkHorn()
	{
		System.out.println("Pip Pip");
	}

}
