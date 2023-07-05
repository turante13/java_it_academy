package Practise.practise_14_06;

import java.util.stream.Stream;
import java.util.Optional;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 5, 3, 2, 4);
        Optional<Integer> maxNumber = findMaxNumber(numbers);

        if (maxNumber.isPresent()) {
            System.out.println("Max number: " + maxNumber.get());
        } else {
            System.out.println("No numbers found.");
        }
    }

    public static Optional<Integer> findMaxNumber(Stream<Integer> numbers) {
        return numbers.max(Integer::compareTo);
    }
}

