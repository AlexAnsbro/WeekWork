
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Exercises {

	public void outputText(String text) {
		System.out.println(text);
	}

	public void sayHello() {
		System.out.println("Hello World");
	}

	public int addTogether(int numOne, int numTwo, boolean multiply) {
		int output;

		if (numOne == 0 || numTwo == 0) {
			output = 0;
		} else if (multiply) {
			output = numOne * numTwo;
		} else {
			output = numOne + numTwo;
		}
		return (output);
	}

	public int blackjack(int firstNumber, int secondNumber) {
		if (firstNumber < 0 || secondNumber < 0) {
			return 0;
		} else if (firstNumber >= 21 && secondNumber >= 21) {
			return 0;
		} else if (firstNumber > secondNumber) {
			return firstNumber;
		} else {
			return secondNumber;
		}
	}

	public int uniqueSum(int firstNumber, int secondNumber, int thirdNumber) {
		int result = 0;

		if (firstNumber != secondNumber) {
			result = result + (firstNumber + secondNumber);
		} else if (secondNumber != thirdNumber) {
			result = result + (secondNumber + thirdNumber);
		}

		if (firstNumber != thirdNumber) {
			result = result + (firstNumber + thirdNumber);
		}

		return result;
	}

	public boolean tooHot(int temp, boolean isSummer) {
		if (temp >= 60 & temp <= 100) {
			if (temp >= 90 && isSummer == false) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	public void searchArray(String nameToSearch, ArrayList<People> morePeople) {
		for (People dude : morePeople) {
			if (dude.getName() == nameToSearch) {
				dude.giveInfo();
			}
		}
	}

	public void level1() {
		// outputText("Say hello function");
		// sayHello();
		// System.out.println(addTogether(1,2));
		// System.out.println(addTogether(6,2, false));
		// System.out.println(addTogether(0,2, false));

		int[] firstArray = new int[10];

		/*
		 * for (int i = 0; i < 10; i++) { System.out.println(addTogether(i,2, false)); }
		 */

		for (int i = 0; i < 10; i++) {
			firstArray[i] = i + 2;
			System.out.println(firstArray[i]);
		}

		for (int i = 0; i < 10; i++) {
			firstArray[i] *= 10;
			System.out.println(firstArray[i]);
		}

		// for each
		for (int i : firstArray) {
			System.out.println(firstArray[i]);
		}
	}

	public void level2() {

		System.out.println(blackjack(12, 6));
		System.out.println(uniqueSum(3, 3, 3));
		System.out.println(tooHot(100, true));

		People Jim = new People("Jim", 84, "Old Man");
		People Tim = new People("Tim", 21, "Snow Salesman");
		People Bim = new People("Bim", 65, "Arsonist");
		People Pim = new People("Pim", 13, "Trump's Twitter Admin");
		People Mim = new People("Mim", 70, "Champion Sitter");
		People Kim = new People("Kim", 45, "Mother of 97");

		ArrayList<People> morePeople = new ArrayList<People>();

		morePeople.add(Jim);
		morePeople.add(Kim);
		morePeople.add(Tim);
		morePeople.add(Bim);
		morePeople.add(Pim);
		morePeople.add(Mim);
		morePeople.add(Kim);

		for (People dude : morePeople) {
			dude.giveInfo();
		}

		searchArray("Pim", morePeople);

		Car LittleBeeper = new Car("Red", "Mini", 4, 2);
		Motorcycle SmollPipper = new Motorcycle("Blue", "Ducati", 2, 1);
		Truck BigOlHonker = new Truck("Lime", "Ford", 16, 3);

		LittleBeeper.putOnSeatbelt();
		LittleBeeper.honkHorn();

		SmollPipper.joinHellsAngels();
		SmollPipper.honkHorn();

		BigOlHonker.longHaulDrive();
		BigOlHonker.honkHorn();

		ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();
		Vehicles.add(LittleBeeper);
		Vehicles.add(SmollPipper);
		Vehicles.add(BigOlHonker);

		Garage NewGarage = new Garage(Vehicles);

		NewGarage.calcBill();

		if (LittleBeeper instanceof Car) {
			System.out.println("Is car");
		}

		NewGarage.seachVehicle("Truck");

		Paint CheapoMax = new Paint("CheapoMax", 20, 19.99, 10);
		Paint AverageJoes = new Paint("AverageJoes", 15, 17.99, 11);
		Paint DuluxourousPaints = new Paint("DuluxourousPaints", 10, 25.00, 20);

		PaintWizard wiz = new PaintWizard(CheapoMax, AverageJoes, DuluxourousPaints);

		// wiz.printTotals(50);
		wiz.calculateCheapest(50);
		wiz.calculateLeastWaste(50);

	}

	public void readAndWrite() {
		ArrayList<Person> People = new ArrayList<Person>();

		Person bill = new Person("Bill", 24, "Journalist");
		Person phill = new Person("Phill", 37, "Landowner");
		Person jill = new Person("Jill", 12, "Secretary");
		Person avrill = new Person("Avrill", 98, "Assembly line worker");
		Person aprill = new Person("Aprill", 43, "Moneylender");

		People.add(bill);
		People.add(phill);
		People.add(jill);
		People.add(avrill);
		People.add(aprill);

		final String fileName = "C:\\AlexAnsbro\\Work\\HelloWorld\\temp.txt";
		
		// This will reference one line at a time
		String line = null;

		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
						
			for (Person temp : People)
			{
				bufferedWriter.write(temp.toString());
				bufferedWriter.newLine();
				bufferedWriter.write("\n");
			}
			bufferedWriter.close();
			
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + fileName + "'");
		}

		String[] sentence= new String[] {""};

		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				sentence = line.split(" ");
			}
			
			for (int i = 0; i < line.length(); i++) {
				System.out.println(sentence[i]);
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
	}
}

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Exercises JSE = new Exercises();
		// JSE.level2();
		JSE.readAndWrite();
	}

}
