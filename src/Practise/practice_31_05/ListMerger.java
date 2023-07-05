package Practise.practice_31_05;

import java.util.ArrayList;
import java.util.List;

public class ListMerger {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        System.out.println("Merged List: " + mergedList);
    }
}

