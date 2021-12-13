package BUOI31.thuchanh.Shape.main;

import BUOI31.thuchanh.Shape.circle.Circle;
import BUOI31.thuchanh.Shape.circle.ComparableCircle;
import BUOI31.thuchanh.Shape.circle.ComparatorCirle;

import java.util.Arrays;
import java.util.Comparator;

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

//        ComparableCircle[] circles = new ComparableCircle[3];
//        circles[0] = new ComparableCircle(3.6);
//        circles[1] = new ComparableCircle();
//        circles[2] = new ComparableCircle(3.5, "Indingo", false);
//
//
//        System.out.println("Pre-sort: ");
//        for (ComparableCircle circle1:circles) {
//            System.out.println(circle1);
//        }
//        System.out.println(circles[1].compareTo(circles[0]));
//
//        Arrays.sort(circles);
//        System.out.println("After - sort");
//        for (ComparableCircle circle1:circles) {
//            System.out.println(circle1);
//        }
//        Circle[] circles1 = new Circle[3];
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new ComparatorCirle();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

    }

}
