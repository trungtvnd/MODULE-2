package BUOI31.thuchanh.Shape.main;

import BUOI31.thuchanh.Shape.circle.Circle;
import BUOI31.thuchanh.Shape.circle.ComparableCircle;
import BUOI31.thuchanh.Shape.shape.Shape;

import java.util.Arrays;



public class MainShape {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//        shape = new Shape("Red", false);
//        System.out.println(shape);
//
//
//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle = new Circle(3.5, "Red", true);
//        System.out.println(circle);

        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "Indingo", false);


        System.out.println("Pre-sort: ");
        for (ComparableCircle circle1:circles) {
            System.out.println(circle1);
        }
        System.out.println(circles[1].compareTo(circles[0]));

        Arrays.sort(circles);
//        System.out.println("After - sort");
//        for (ComparableCircle circle1:circles) {
//            System.out.println(circle1);
//        }

    }
}
