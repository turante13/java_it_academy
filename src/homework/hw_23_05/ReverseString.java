package homework.hw_23_05;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(input);

        reversed.reverse();

        System.out.println("Reversed String: " + reversed.toString());
    }
}

