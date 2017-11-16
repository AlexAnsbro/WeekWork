import java.util.Scanner;

public class OfflineWorkRunner {

	public static String doubleChar(String input) {

		String doubbledString = "";

		for (int i = 0; i < input.length(); i++) {
			doubbledString += input.charAt(i);
			doubbledString += input.charAt(i);
		}

		return doubbledString;
	}

	public static void print(String input) {
		System.out.println(input);
	}

	public static void print(int input) {
		System.out.println(input);
	}

	public static String findTheFilling(String input) {
		String emptyString = "";
		int bread1Index = input.indexOf("bread") + 5;
		int bread2Index = input.indexOf("bread", bread1Index);
		if (bread2Index > 0) {
			String subStr = input.substring(bread1Index, bread2Index);
			return subStr;
		} else {
			return emptyString;
		}
	}

	public static String evenlySpaced(int one, int two, int three) {
		if (one % 2 == 0 && two % 2 == 0 && three % 2 == 0) {
			return "True";
		} else {
			return "False";
		}
	}

	public static String nTwice(String inputS, int size) {
		char firstLetter = inputS.charAt(0);
		char lastLetter = inputS.charAt(inputS.length() - 1);
		String subStr = inputS.substring(1, size);

		String output = "";

		output += (firstLetter + subStr + lastLetter);

		return output;
	}

	public static String endsLy(String input) {
		int lyIndex = input.lastIndexOf("ly");
		if (lyIndex > 0) {
			return "True";
		} else {
			return "False";
		}
	}

	public static String stringClean(String input) {
		String cleanedString = "";
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) != input.charAt(i + 1)) {
				cleanedString += input.charAt(i);
			}
		}
		cleanedString += input.charAt(input.length() - 1);
		return cleanedString;
	}

	public static void makeDiamond(int n, char c) { /// size of diamond and then the char used
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)

			{
				System.out.print(" ");
			}

			for (int j = 1; j <= i * 2 - 1; j++)

			{
				System.out.print(c);
			}
			System.out.println();

		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= n - i; j++)

			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++)

			{
				System.out.print(c);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		// print(doubleChar("The"));
		//
		// print(findTheFilling("xxbreadyy"));
		//
		// print(evenlySpaced(2, 6, 3));
		//
		// print(nTwice("Chocolate", 1));
		//
		// print (endsLy("oddy"));
		//
		// print (stringClean("yyzzza"));

		makeDiamond(30, '%');
	}

}
