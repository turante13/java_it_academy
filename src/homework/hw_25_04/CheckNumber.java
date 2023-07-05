package homework.hw_25_04;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        try {
            double number = Double.parseDouble(input);
            System.out.println("Это число");
        } catch (NumberFormatException e) {
            System.out.println("Это не число");
        }
    }
}

