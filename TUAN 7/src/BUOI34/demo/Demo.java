package BUOI34.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
//        ArrayList<String> animals = new ArrayList<>();
//        animals.add("Dog");
//        animals.add("Cat");
//        animals.add("Horse");
//        System.out.println(animals);
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        System.out.println(numbers);
//        int number = numbers.get(2);
//        System.out.println(number);
//        numbers.remove(0);
//        System.out.println(numbers);
//
//        List<Integer> numberList = new LinkedList<>();
//        numberList.add(1);
//        numberList.add(2);
//        numberList.add(3);
//        numberList.add(3, 12);
//        int number1 = numberList.get(2);
//        numberList.addAll(numbers);
//        System.out.println(number1);
//        System.out.println(numberList);
//ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat", "Dog"));
//        System.out.println(animals);

//        ArrayList<String> animals = new ArrayList<>(Arrays.asList("cat", "Dog", "Horse", "Bird"));
////        Iterator<String> iterate = animals.iterator();
////        System.out.println("ArrayList: ");
////        while (iterate.hasNext()){
////            System.out.print(iterate.next());
////            System.out.println(",");
////        }
//        for (String animal : animals) {
//            System.out.println(animal);

//        }
//        LinkedList<String> animals = new LinkedList<>();
//
//        // Add elements using indexes
//        animals.add(0,"Dog");
//        animals.add(1,"Cat");
//        animals.add(2,"Horse");
//        animals.add(4,"HEHE");
//
//        System.out.println("LinkedList: " + animals);
        ArrayList<String> animals= new ArrayList<>();

        // Creating an object of ListIterator
        ListIterator<String> listIterate = animals.listIterator();
        listIterate.add("Dog");
        listIterate.add("Cat");

        System.out.println("LinkedList: " + animals);
    }
}
