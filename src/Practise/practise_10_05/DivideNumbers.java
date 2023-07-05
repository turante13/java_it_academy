package Practise.practise_10_05;
import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first digit: ");
            int a = scanner.nextInt();
            System.out.print("Enter second digit: ");
            int b = scanner.nextInt();
            double result = a / b;
            System.out.println("Division result: " + result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: enter non-float digit");
        } catch (ArithmeticException e) {
            System.out.println("Error: null division");
        }
    }
}

