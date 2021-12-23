package BUOI39.thuchanh.demo;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Scanner sc = new Scanner(System.in);
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 6;
        intArray[6] = 7;
        try {
            for (int i = 0; i < intArray.length; i++) {
                int b = 9 / intArray[i];
                int c = sc.nextInt();
                int d = 9 / intArray[c];
                System.out.println("Phần tử thứ i" + i + "chia cho 9 =" + b);
                System.out.println("d bằng: " + d);
            }
        } catch (ArithmeticException a) {
            System.out.println("Lỗi chia cho 0: " + a.getMessage());
        } catch (ArrayIndexOutOfBoundsException a1) {
            System.out.println("Lỗi truy cập phần tử không tồn tại trong aray" + a1.getMessage());
        }

    }
}
