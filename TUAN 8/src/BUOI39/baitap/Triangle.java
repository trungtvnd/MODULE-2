package BUOI39.baitap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Nhập vào cạnh 1"); int side1 = sc.nextInt();
            System.out.println("Nhập vào cạnh 2"); int side2 = sc.nextInt();
            System.out.println("Nhập vào cạnh 3"); int side3 = sc.nextInt();
            if(side1 > 0 && side2 >0 && side3>0){
                if(side1 + side2 > side3 || side1 + side3 > side2 || side3+ side2 > side1){
                    System.out.println("Đây là ba cạnh của tam giác");
                }

        }
    }

}
