
public class Paint {
	
	private String name;
	private int ammountLitre;
	private double price;
	private int coverage; //per m2
	private int numOfCans;
	
	public Paint(String name, int ammountLitre, double price, int coverage) {
		this.name = name;
		this.ammountLitre = ammountLitre;
		this.price = price;
		this.coverage = coverage;
	}
	
	public String getName () {return name;}
	public int getLiters() {return ammountLitre;}
	public double getPrice() {return price;}
	public int getCoverage() {return coverage;}

	
	
	public int getAmmountLitre() {
		return ammountLitre;
	}

	public void setAmmountLitre(int ammountLitre) {
		this.ammountLitre = ammountLitre;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	public String toString()
	{
		return "Name: " + name + "/nPrice : £" + price + "n/" + coverage + "m2";
	}
	
	
	public String printInfo(int numOfCans)
	{
		
		return "Name: " + name + "\nAmount of cans: " + numOfCans + "\nPrice: £" + (ammountLitre *= numOfCans) + "\nTotal Coverage: " + (coverage *= numOfCans) + "m2";
		
	}
}
