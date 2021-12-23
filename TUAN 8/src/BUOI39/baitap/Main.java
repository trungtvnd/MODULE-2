package BUOI39.baitap;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            inputSide();
        }catch (TriangleException te) {
            te.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    private static void inputSide() throws IOException, TriangleException{
        int aSide;
        int bSide;
        int cSide;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input side a");
        aSide = sc.nextInt();
        System.out.println("Input side b");
        bSide = sc.nextInt();
        System.out.println("input side c");
        cSide = sc.nextInt();

        if(aSide <=0||bSide<=0||cSide<=0){
            throw new TriangleException("Side is not Valid");
        }
        if(aSide+bSide<=cSide||aSide+cSide<=bSide||bSide+cSide<=aSide){
            throw new TriangleException("Not a triangle");
        };


        Triangle triangle = new Triangle(aSide,bSide,cSide);
        System.out.print(triangle.getA()+" "+ triangle.getB() +" "+triangle.getC());
    }
}
