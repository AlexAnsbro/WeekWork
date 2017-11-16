
public class Car  extends Vehicle{

	public Car(String colour, String make, int numberOfWheels, int numberOfSeats) {
		super(colour, make, numberOfWheels, numberOfSeats); //Refers to class one up e.g Vehicle
		
	}
	public void honkHorn()
	{
		System.out.println("Beep Beep");
	}
}
