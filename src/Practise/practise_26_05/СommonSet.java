package Practise.practise_26_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CommonSet{
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(5);
        set1.add(7);
        set1.add(9);
        set1.add(1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(6);
        set2.add(9);
        set2.add(1);
        set2.add(6);
        set2.add(5);

        if (set1 == set2){
            System.out.println("Have same elements");
        } else{
            System.out.println("Do not have same elements ");
        }


    }
}