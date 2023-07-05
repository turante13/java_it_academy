package Practise.practise_26_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbersWith = new ArrayList<>();
        numbersWith.add(1);
        numbersWith.add(2);
        numbersWith.add(3);
        numbersWith.add(2);
        numbersWith.add(1);
        numbersWith.add(4);

        System.out.println("List of duplicates: " + numbersWith);

        Set<Integer> uniqueNumbers = new HashSet<>(numbersWith);
        List<Integer> numbers = new ArrayList<>(uniqueNumbers);

        System.out.println("List without duplicates: " + numbers);
    }
}
