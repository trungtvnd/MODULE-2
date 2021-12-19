package BUOI36.thuchanh.hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Adam", 31);
        hashMap.put("Paul", 20);
        hashMap.put("Anna", 26);
        hashMap.put("Simon", 28);
        System.out.println("Display hashMap \n");
        System.out.println(hashMap);

        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Adam", 32);
        linkedHashMap.put("Evas", 22);
        linkedHashMap.put("Sam", 20);
        System.out.println(linkedHashMap);
    }

}
