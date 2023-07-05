package classroom.class_20_05;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(2);

        List<Integer> list1 = new ArrayList<>();
        list1.add(45);
        list1.add(65);
        list1.add(23);
        list1.add(89);
        list1.remove(1);
        list.addAll(list1);
        System.out.println(list);

    }

}

