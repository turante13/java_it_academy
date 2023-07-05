package homework.hw_23_05;

import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter line: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter first substring: ");
        String substring1 = scanner.nextLine();

        System.out.print("Enter second substring: ");
        String substring2 = scanner.nextLine();

        String replacedString = inputString.replaceAll(substring1, substring2);

        System.out.println("Replaced line: " + replacedString);
    }
}

