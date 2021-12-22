package BUOI39.thuchanh.demo;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);


        try{
            System.out.println("Input number n");
            int n = scanner.nextInt();
            System.out.println("ok");
        } catch (Exception e){
            System.out.println("Error");
        }
        System.out.println("Done");

        try{
            System.out.println("Input number n");
            int n = scanner.nextInt();
            System.out.println("ok");
        }catch (Exception e){
            System.out.println("Error!" +
                    "");
        }
    }
}
