package BUOI36.thuchanh.hashSetVaHashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapVaHashSet {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hà", 22, "HN");
        Student student3 = new Student("An", 21, "NĐ");
        Student student4 = new Student("Kiên", 19, "NB");

        HashMap<Integer, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(1, student1);
        studentHashMap.put(2, student1);
        studentHashMap.put(3, student1);
        studentHashMap.put(4, student1);

        for (Map.Entry<Integer, Student> studentEntry:studentHashMap.entrySet()) {
            System.out.println(studentEntry.toString());

        }
        System.out.println("==========");

        HashSet<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for (Student st:students) {
            System.out.println(st.toString());
        }

    }
}
