import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Simple Calculator!");
        
        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            System.out.print("Enter operation (+, -, *, /) or 'exit' to quit: ");
            String operation = scanner.next();
            
            if (operation.equals("exit")) {
                break;
            }
            
            double result;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation! Please try again.");
            }
        }
        
        scanner.close();
        System.out.println("Thank you for using the Simple Calculator!");
    }
}
