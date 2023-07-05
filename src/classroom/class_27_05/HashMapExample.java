package classroom.class_27_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "John Bin");
        map.put(3567, "Edward Norton");
        map.put(1287, "Elvis Prestley");
        map.put(134, "Jacky Chan");
        map.putIfAbsent(100, "Sergey");
        //   System.out.println(map.values());
        // map.put(1000, "Sergey Petrov");
        map.put(null, "Andrey Sidorov");
        map.put(null, "Sidorov");
        map.put(1001, null);
        // методы: put, putIfAbsent(добавляется, если такого элемента еще нет), get(выводит значение по ключу)
        // remove, containsValue(выводит true, если значение есть в Map), containsKey, keySet(возвращает множество ключей,
        // которые есть в коллекции), values (возврщает множество значений), entrySet
        System.out.println(map);
    }
}

