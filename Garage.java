import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> Vehicles;

	public Garage(ArrayList<Vehicle> Vehicles) {
		this.Vehicles = Vehicles;
	}

	public void calcBill() {
		int totalCost = 0;
		for (Vehicle StandIn : Vehicles) {
			totalCost = (20 * StandIn.getNumOfWheels()) + (60 * StandIn.getnumberOfSeats());
			if (StandIn instanceof Car) {totalCost += 50;}
			else if (StandIn instanceof Motorcycle) {totalCost += 20;}
			else if (StandIn instanceof Truck) {totalCost += 100;}
			
			StandIn.bill = totalCost;
			System.out.println("Total: £" + StandIn.bill);
		}
	}

	public void fillGarage(ArrayList<Vehicle> Vehicles) {
		this.Vehicles = Vehicles;
	}

	public void emptyGarage() {
		Vehicles.clear();
	}

	public void addCar(Vehicle temp) {
		Vehicles.add(temp);

	}
	
	public void seachVehicle(String str){
		for (Vehicle StandIn : Vehicles) {	
			if(StandIn.getMake() == str) {System.out.println(StandIn.toString());}
			else if (StandIn.getColour() == str) {System.out.println(StandIn.toString());}
			else if (StandIn instanceof Car && str == "Car") {System.out.println(StandIn.toString());}
			else if (StandIn instanceof Truck && str == "Truck") {System.out.println(StandIn.toString());}
			else if (StandIn instanceof Motorcycle && str == "Motorcycle") {System.out.println(StandIn.toString());}
			}
		}
		
	public void seachVehicle(int id){
		for (Vehicle StandIn : Vehicles) {
			if(StandIn.getId() == id){System.out.println(StandIn.toString());}		
		}
	}
}
