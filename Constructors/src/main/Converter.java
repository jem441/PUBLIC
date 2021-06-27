package main;
import java.util.Scanner;
public class Converter {
	public static void main(String[] args) {
		Integer[] choice = {1,2,3,4};
		int menuSelection = 0;
		Scanner scan = new Scanner(System.in);
		
		while(menuSelection != choice.length) {
			System.out.println("Please select an option:");
			System.out.println("1. Cups to Pints");
			System.out.println("2. Pints to Quarts");
			System.out.println("3. Quarts to Gallons");
			System.out.println("4. Quit");
			menuSelection = scan.nextInt();

		switch(menuSelection) {
			case 1:
				System.out.println("You entered: " + menuSelection);
				System.out.println("Enter how many cups you want to convert to pints:");
				int quantity1 = scan.nextInt();
				System.out.println("You entered: " + quantity1);
				System.out.println("You get " + quantity1 * 0.5f + " pints!");
				break;
			case 2:
				System.out.println("You entered: " + menuSelection);
				System.out.println("Enter how many pints you want to convert to quarts:");
				int quantity2 = scan.nextInt();
				System.out.println("You entered: " + quantity2);
				System.out.println("You get " + quantity2 * 0.5f + "quarts!");	
				break;
			case 3:
				System.out.println("You entered: " + menuSelection);
				System.out.println("Enter how many quarts you want to convert to gallons:");
				int quantity3 = scan.nextInt();
				System.out.println("You entered: " + quantity3);
				System.out.println("You get " + quantity3 * 0.25f + "gallons!");
			break;	
			}
		}
		scan.close();
	}	
}