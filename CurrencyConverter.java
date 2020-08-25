package lab1;
import java.util.Scanner;
public class CurrencyConverter {



	public static void main(String[] args) {
	
	
		System.out.println("This is a currency converter for USD-CAD. Made by Adam Plater-Zyberk.");
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter how many USD to convert to CAD: ");
		
		double USD = input.nextDouble();
		
		System.out.print("Enter currency exchange rate: ");
		
		float conversionRate = input.nextFloat();
		
				
		double CAD = USD * conversionRate;
		
		input.close();
	
		System.out.printf("Your $%.2fUSD equals $%.4fCAD",USD,CAD);
		
		
	}

}


