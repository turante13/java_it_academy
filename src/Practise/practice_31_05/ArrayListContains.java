package Practise.practice_31_05;

import java.util.ArrayList;
public class ArrayListContains {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(18);

        System.out.println("ArrayList = " + arrayList);

        if (arrayList.contains(10)) {
            System.out.println("element 10 is present in the arrayList");
        } else {
            System.out.println("element 10 is not present in the arrayList");
        }

        if (arrayList.contains(25)) {
            System.out.println("element 25 is present in the arrayList");
        } else {
            System.out.println("element 25 is not present in the arrayList");
        }
    }
}
