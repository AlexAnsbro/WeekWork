
public class Truck extends Vehicle  {

	public Truck(String colour, String make, int numberOfWheels, int numberOfSeats) {
		super(colour, make, numberOfWheels, numberOfSeats);
		
	}
	
	public void longHaulDrive()
	{
		System.out.println("plotting long haul drive");
	}
	
	public void honkHorn()
	{
		System.out.println("Berrrb Berrb");
	}

}
