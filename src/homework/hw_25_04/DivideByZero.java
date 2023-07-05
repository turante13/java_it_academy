package homework.hw_25_04;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите делимое: ");
            int dividend = scanner.nextInt();
            System.out.print("Введите делитель: ");
            int divisor = scanner.nextInt();
            int result = dividend / divisor;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль невозможно");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

