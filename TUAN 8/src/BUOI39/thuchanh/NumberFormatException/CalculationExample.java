package BUOI39.thuchanh.NumberFormatException;

import BUOI36.baitap.baiTapThem.Cat;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x");
        int x = scanner.nextInt();
        System.out.println("Nhập y");
        int y = scanner.nextInt();
        CalculationExample cal = new CalculationExample();
        cal.calculate(x,y);
    }

    public void calculate(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
        }catch (Exception e){
            System.out.println("Xấy ra ngoại lệ: " + e.getMessage()+"\n"+ e.getCause());
        }
    }
}
