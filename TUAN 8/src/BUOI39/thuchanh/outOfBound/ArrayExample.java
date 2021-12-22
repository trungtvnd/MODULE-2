package BUOI39.thuchanh.outOfBound;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public Integer[] creatRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chỉ số của một phần tử bất kỳ");
        int x = scanner.nextInt();
        try{
            System.out.println("Giá trị của phần tử có chỉ số " +x + "la" + arr[x]);
        }catch (IndexOutOfBoundsException e ){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }

}
