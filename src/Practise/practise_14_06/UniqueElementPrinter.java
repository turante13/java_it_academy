package Practise.practise_14_06;

import java.util.stream.Stream;

public class UniqueElementPrinter {
    public static void main(String[] args) {
        Stream<String> elements = Stream.of("apple", "banana", "apple", "orange", "banana");
        printUniqueElements(elements);
    }

    public static void printUniqueElements(Stream<String> elements) {
        elements.distinct().forEach(System.out::println);
    }
}
