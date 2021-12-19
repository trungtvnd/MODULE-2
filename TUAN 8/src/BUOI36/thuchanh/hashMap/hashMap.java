package BUOI36.thuchanh.hashMap;

import java.util.HashMap;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("john", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 27);
        customers.put("Maria", 23);

        Set<String> keys = customers.keySet();
        for (String key:keys) {
            System.out.println("key " +key + ": " +customers.get(key));
        }
    }

}
