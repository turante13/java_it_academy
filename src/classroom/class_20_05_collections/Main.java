package classroom.class_20_05_collections;
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
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
