package Practise.practise_14_06;

import java.util.stream.Stream;

public class UppercaseConverter {
    public static void main(String[] args) {
        String text = "Hello, World!";
        convertToUppercase(text);
    }

    public static void convertToUppercase(String text) {
        Stream.of(text)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
