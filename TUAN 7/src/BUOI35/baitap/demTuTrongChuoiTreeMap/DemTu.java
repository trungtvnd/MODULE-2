package BUOI35.baitap.demTuTrongChuoiTreeMap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class DemTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcysisyy,.lkjhluhs di aj no e";
      str = str.replaceAll(",","");
      str = str.replaceAll("\\.","");
      str = str.replaceAll(" ","");
      String[] data = str.split("");
        System.out.println(Arrays.toString(data));
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < data.length; i++) {
            String key = data[i];
            int value = 1;
            if(treeMap.containsKey(key)){
                value = treeMap.get(key);
                treeMap.remove(key);
                treeMap.put(key, ++value);
            }else {
                treeMap.put(key, value);
            }
        }
        System.out.println(treeMap);
    }
}
