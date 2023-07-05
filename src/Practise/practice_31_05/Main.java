package Practise.practice_31_05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы списка через пробел: ");
        String input = scanner.nextLine();

        List<String> elements = Arrays.asList(input.split(" "));

        Map<String, Integer> elementCount = new HashMap<>();
        for (String element : elements) {
            if (elementCount.containsKey(element)) {
                elementCount.put(element, elementCount.get(element) + 1);
            } else {
                elementCount.put(element, 1);
            }
        }

        System.out.println("Количество повторений каждого элемента:");
        for (Map.Entry<String, Integer> entry : elementCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

