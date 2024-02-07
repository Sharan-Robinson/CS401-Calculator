package simple_calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Welcome to the Simple Calculator!"); 
        Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter the first number:");
			float firstNumber;

			try{
			firstNumber = scanner.nextFloat();
			}catch(InputMismatchException e){
				System.out.println("Error: You have entered an invalid value, please try again."); 
				scanner.nextLine();

				continue; 
			}
			System.out.println(""); 
			
			System.out.print("Enter the second number:");
			float secondNumber; 
			
			try {
			secondNumber = scanner.nextFloat();
			}catch(InputMismatchException e){
				System.out.println("Error: You have entered an invalid value, please try again."); 
				scanner.nextLine();

				continue; 
			}

			System.out.println(""); 
			
			System.out.println("Select an operation: "); 
			
			System.out.println("1. Addition"); 
			System.out.println("2. Subtraction"); 
			System.out.println("3. Multiplication"); 
			System.out.println("4. Division"); 

			System.out.println("Enter the operation number: "); 
			
			int operator = 0;
			
			try {		
				operator = scanner.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Error: You have entered an invalid value, please try again."); 
				scanner.nextLine();
				continue; 
			}
			float result = 0; 
			
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
	
				
				while(secondNumber == 0)
				{
						System.out.println("Remember, you can not divide by 0, please enter a new number: ");
					
					try {
						secondNumber = scanner.nextFloat();
						}catch(InputMismatchException e){
							System.out.println("Error: You have entered an invalid value, please try again."); 
							scanner.nextLine();

							continue; 
						}

				}
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
			
			String continueLoop;
			
            while (true) {
                System.out.println("Do you want to perform another calculation? (yes/no):");
                continueLoop = scanner.nextLine();

                if (continueLoop.equalsIgnoreCase("no") || continueLoop.equalsIgnoreCase("yes")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please specify 'yes' or 'no'.");
                }
            }

            if (continueLoop.equalsIgnoreCase("no")) {
                break;
            }
        }
		
		System.out.println("Goodbye!");
		scanner.close();
	}
} 