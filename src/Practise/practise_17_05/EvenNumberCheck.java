package Practise.practise_17_05;

import java.util.function.Predicate;

public class EvenNumberCheck {
    public static void main(String[] args) {
        int number = 86;
        boolean isEven = checkEven(number);
        System.out.println("Number " + number + (isEven ? " even" : " odd"));
    }

    public static boolean checkEven(int number) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        return isEven.test(number);
    }
}

