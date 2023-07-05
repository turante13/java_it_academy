package Practise.practise_10_05;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();
            if (number < 2) {
                throw new Exception("Число должно быть больше или равно 2");
            }
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.println(number + " - простое число");
            } else {
                System.out.println(number + " - составное число");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

