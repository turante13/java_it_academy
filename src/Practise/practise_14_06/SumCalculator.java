package Practise.practise_14_06;

import java.util.stream.Stream;

public class SumCalculator {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        int sum = calculateSum(numbers);
        System.out.println("Sum: " + sum);
    }

    public static int calculateSum(Stream<Integer> numbers) {
        return numbers.mapToInt(Integer::intValue).sum();
    }
}

