package classroom.class_27_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Double>  hm = new HashMap<>();

        hm.put("Israpil", 3434.34);
        hm.put("Croco", 123.22);
        hm.put("Shtora", 1378.00);
        hm.put("Pes", 99.22);
        hm.put("Slepoi", -19.08);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me:set){
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
