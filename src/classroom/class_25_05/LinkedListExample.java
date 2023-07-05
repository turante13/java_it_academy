package classroom.class_25_05;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Borya");
        queue.add("Israpil");
        queue.add("Gaspar");
        queue.add("Shovkhal");
        queue.add("Pers");
        queue.add("Chorsh");
        queue.add("Hasbulla");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

    }
}
