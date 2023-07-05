package Practise.practise_24_05;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEven {
    public static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumb = new ArrayList<>();
        for (int number : numbers){
            if (number % 2 == 0){
                evenNumb.add(number);
            }
        }
        return evenNumb;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);
        numbers.add(1);
        numbers.add(1);

        ArrayList<Integer> evenNumb = getEvenNumbers(numbers);
        System.out.println("Get even numbers from List " + evenNumb);
    }
}
