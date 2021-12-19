package BUOI36.thuchanh.comparableVacomparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Trung", 30, "NĐ");
        Student student2 = new Student("Kiên", 28, "HN");
        Student student3 = new Student("Tai", 25, "NĐ");
        Student student4 = new Student("Văn", 21, "HN");

       ArrayList<Student> students = new ArrayList<>();
       students.add(student1);
       students.add(student2);
       students.add(student3);
       students.add(student4);
        Collections.sort(students);
        for (Student student:students) {
            System.out.println(student);
        }
        AgeComparator ageComparator =  new AgeComparator();
        Collections.sort(students, ageComparator);
        System.out.println("Compare by age");
        for (Student student: students){
            System.out.println(student);
        }
    }



}
