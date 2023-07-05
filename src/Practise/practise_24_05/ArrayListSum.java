package Practise.practise_24_05;

import java.util.ArrayList;

public class ArrayListSum {
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int totalSum = sum(numbers);
        System.out.println("Total sum of numbers: " + totalSum);
    }
}

