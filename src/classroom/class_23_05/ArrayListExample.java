package classroom.class_23_05;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Bob");
        list.add("Den");
        list.add("Jenny");
        list.add("Bill");
        list.add(1,"Susanne");

        System.out.println(list);
        list.set(0, "Marley");
        System.out.println(list);
    }
}
