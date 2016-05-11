import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Enter a number");
		int myInt = Integer.parseInt(inputScan.nextLine());
		


		//Prompt user for string
		System.out.println("Enter a string");
		String myString = inputScan.nextLine();	

		
		//Prompt user for float
		System.out.println("Enter a float");
		float myFloat = Float.parseFloat(inputScan.nextLine());
		
		//Print out the inputs
		System.out.printf("Inputs: %d %s %f \n", myInt, myString, myFloat);
		
		inputScan.close();
	}

}
