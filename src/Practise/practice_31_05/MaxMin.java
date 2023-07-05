package Practise.practice_31_05;

import java.util.*;
public class MaxMin {
    public static void main (String[] args) {
        List<Integer> list = new ArrayList<Integer>();
            list.add(14);
            list.add(2);
            list.add(73);
            System.out.println("Maximum element : " + Collections.max(list));
            System.out.println("Minimum element : " + Collections.min(list));
    }
}
