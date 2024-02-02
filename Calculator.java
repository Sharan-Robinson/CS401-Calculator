package simple_calculator;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) {
		System.out.println("Welcome to the Simple Calculator!"); 
        Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter the first number:");
			Integer firstNumber;
			
			try{
			firstNumber = scanner.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Error: You have entered an invalid Value, Please try again."); 
				scanner.nextLine();

				continue; 
			}
			System.out.println(""); 
			
			System.out.print("Enter the second number:");
			Integer secondNumber; 
			
			try {
			secondNumber = scanner.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Error: You have entered an invalid Value, Please try again."); 
				scanner.nextLine();

				continue; 
			}

			System.out.println(""); 
			
			System.out.println("Select an operation:"); 
			
			System.out.println("1. Addition"); 
			System.out.println("2. Subtraction"); 
			System.out.println("3. Multiplication"); 
			System.out.println("4. Division"); 

			System.out.println("Enter the operation number:"); 
			
			Integer operator = 0;
			
			try {		
				operator = scanner.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Error: You have entered an invalid Value, Please try again."); 
				scanner.nextLine();
				continue; 
			}
			Integer result = 0; 
			
			if(operator == 1) {
				result = firstNumber + secondNumber; 
			}
			
			
			else if(operator == 2) {
				result = firstNumber - secondNumber; 
			}
			
			
			else if(operator == 3) {
				result = firstNumber * secondNumber; 
			}
			
			
			else if(operator == 4) {
				result = firstNumber / secondNumber; 
			}else {
				System.out.println("You have entered an invalid operator, please try again!");
				scanner.nextLine();
				continue; 
			}
			
			String[] numbers = new String[5];
			numbers[1] = "+";
			numbers[2] = "-";
			numbers[3] = "*";
			numbers[4] = "/";
			
	


			
			System.out.println(""); 
			System.out.print("Result:");
			System.out.print(firstNumber);
			System.out.print(" ");
			System.out.print(numbers[operator]);
			System.out.print(" ");
			System.out.print(secondNumber);
			System.out.print(" ");
			System.out.print("=");
			System.out.print(" ");

			
			System.out.print(result);
			System.out.println(""); 
			
			if (scanner.hasNextLine()) {
	            scanner.nextLine();
	        }

			System.out.println("Do you want to perform another calculation? (yes/no):");
			String continueLoop = scanner.nextLine();
					
			if(continueLoop.equalsIgnoreCase("no")) {
				break;
			}

		}
		
		System.out.println("Goodbye!");
	}
	
	
	
}


