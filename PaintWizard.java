import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class PaintWizard {
	
	ArrayList<Paint> paints = new ArrayList<Paint>();
	
	public PaintWizard(Paint Paint1, Paint Paint2, Paint Paint3) {
		paints.add(Paint1);
		paints.add(Paint2);
		paints.add(Paint3);
	}
	
	
	public void printTotals(int sizeOfRoom)

	{
		for (int i = 0; i < 3; i++){System.out.println(paints.get(i).printInfo(calcualteNumOfCans(sizeOfRoom, paints.get(i))));}
	}
	
	private int calcualteNumOfCans (int sizeOfRoom, Paint tempPaint)
	{
		int ammountOfCans = 0; 
		double totalPrice = 0; 
		int totalCovered  = 0;
		
		while ( totalCovered < sizeOfRoom) {		
			
			ammountOfCans++;
			totalPrice = ammountOfCans * tempPaint.getPrice();    //price of the total amount of cans
			totalCovered = ammountOfCans * tempPaint.getCoverage(); //total coverage of paint
		}
		
		return ammountOfCans;
	}
	
	private int calculateWaste (int sizeOfRoom, Paint tempPaint)
	{
		int ammountOfCans = 0; 
		double totalPrice = 0; 
		int totalCovered  = 0;
		
		while ( totalCovered < sizeOfRoom) {		
			
			ammountOfCans++;
			totalPrice = ammountOfCans * tempPaint.getPrice();    //price of the total amount of cans
			totalCovered = ammountOfCans * tempPaint.getCoverage(); //total coverage of paint
		}
		
		return totalCovered - sizeOfRoom;
	}
	public Paint calculateCheapest(int sizeOfRoom)
	{
		Paint CheapPaint = new Paint("Cheapest",0, 10000.0, 0);
		for (int i = 0; i < 3; i++)
		{
			if (calcualteNumOfCans(sizeOfRoom, paints.get(i)) * paints.get(i).getPrice() < CheapPaint.getPrice())
			{
				CheapPaint = paints.get(i);
			}
		}
		System.out.println(CheapPaint.printInfo(calcualteNumOfCans(sizeOfRoom, CheapPaint))+ "\nWaste: " + calculateWaste(sizeOfRoom, CheapPaint));
		
		return CheapPaint;
	}

	public Paint calculateLeastWaste(int sizeOfRoom)
	{
		Paint lowestWastePaint = new Paint("LowestWaste",0, 10000.0, 0);
		int lowestWaste = 1000;
		for (Paint temp : paints)
		{
			if (calculateWaste(sizeOfRoom, temp) < lowestWaste)
			{
				lowestWaste = calculateWaste(sizeOfRoom, temp);
				lowestWastePaint = temp;
			}
		}
		System.out.println("The Paint for the least waste is " + lowestWastePaint.getName() + " with " + lowestWaste + "ml wasted");
		return lowestWastePaint;
	}



}
