package BUOI36.thuchanh;

import BUOI36.baitap.luyentapArrayLinked.ArrayList.Product;

import java.util.*;

public class SetExple {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        Set<String> stringSet1 = new HashSet<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringSet.add("Huy");
        stringSet.add("sáng");
        stringSet1.add("Vương");
        stringArrayList.add("Hiếu");
        stringArrayList.add("Huy");
        System.out.println(stringSet);
        stringSet1.addAll(stringSet);
       stringSet1.addAll(stringArrayList);
        System.out.println(stringSet1);

        Set<Product> products = new HashSet<>();
        Product product = new Product("Máy tiện", " New", 15000);
        Product product1 = new Product("Máy tiện", " New", 15000);
        products.add(product1);
        products.add(product);
        System.out.println(products);

        //contains
        System.out.println(stringSet1.contains("Vương"));

        //equals

        System.out.println(stringSet1.equals(stringSet));

        //hashcode
        System.out.println(stringSet1.hashCode());

        //isEmpty

        System.out.println(stringSet.isEmpty());

        //remove
//        System.out.println("---");
//        System.out.println(stringSet1.remove("Huy"));
//        System.out.println(stringSet1.removeAll(stringSet1));
//       stringSet1.clear();
//        System.out.println(stringSet1);
//
        //size
        System.out.println("---");
        System.out.println(stringSet1.size());
        System.out.println(stringSet.size());

// toarray
        Object[] strList = new String[stringSet1.size()];
        strList = stringSet1.toArray();

    }
}
