package homework.hw_23_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter line: ");
        String input = scanner.nextLine();

        Set<Character> uniqueChars = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (uniqueChars.add(c)) {
                result.append(c);
            }
        }

        System.out.println("Line without duplicated symbols: " + result.toString());
    }
}

