package Practise.practise_14_06;

import java.util.stream.Stream;

public class PositiveNumberPrinter {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(-1, 2, -3, 4, -5);
        printPositiveNumbers(numbers);
    }

    public static void printPositiveNumbers(Stream<Integer> numbers) {
        numbers.filter(n -> n > 0)
                .forEach(System.out::println);
    }
}
