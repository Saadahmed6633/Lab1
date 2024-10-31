import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Advanced Calculator!");

        while (true) {
            System.out.print("Enter first number (or type 'exit' to quit): ");
            String input1 = scanner.next();

            if (input1.equalsIgnoreCase("exit")) {
                break;
            }

            double num1 = Double.parseDouble(input1);

            System.out.print("Enter operation (+, -, *, /, ^ for exponentiation, sqrt for square root, sin for sine, cos for cosine, tan for tangent): ");
            String operation = scanner.next();

            double result;

            switch (operation) {
                case "+":
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                case "^":
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    result = Math.pow(num1, exponent);
                    System.out.println("Result: " + result);
                    break;
                case "sqrt":
                    if (num1 < 0) {
                        System.out.println("Error: Cannot calculate the square root of a negative number!");
                    } else {
                        result = Math.sqrt(num1);
                        System.out.println("Result: " + result);
                    }
                    break;
                case "sin":
                    result = Math.sin(Math.toRadians(num1));
                    System.out.println("Result: " + result);
                    break;
                case "cos":
                    result = Math.cos(Math.toRadians(num1));
                    System.out.println("Result: " + result);
                    break;
                case "tan":
                    result = Math.tan(Math.toRadians(num1));
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operation! Please try again.");
            }
        }
        
        scanner.close();
        System.out.println("Thank you for using the Advanced Calculator!");
    }
}
