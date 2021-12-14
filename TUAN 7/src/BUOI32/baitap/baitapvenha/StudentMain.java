package BUOI32.baitap.baitapvenha;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Thành", 20,"Nam", "HN", 9);
        students[1] = new Student("Thu", 20,"Nữ", "HN", 3);
        students[2] = new Student("Kiên", 18,"Nam", "HN", 5);
        students[3] = new Student("Hoài", 18,"Nữ", "HN", 7);
        students[4] = new Student("Thái", 21,"Nam", "HY", 5.6);
        students[5] = new Student("Mai", 22,"Nữ", "NĐ", 6.5);
        students[6] = new Student("Thế", 21,"Nam", "NĐ", 8.5);
        students[7] = new Student("Thu", 23,"Nữ", "HB", 7.6);
        students[8] = new Student("Hoàng", 20,"Nam", "HB", 9);
        students[9] = new Student("Mai", 20,"Nữ", "HB", 9.8);


        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Data Student");
            System.out.println("1. Create array input n student");
            System.out.println("2. Show the highest, lowest Point");
            System.out.println("3. Add Student");
            System.out.println("4. Delete Student by name");
            System.out.println("5. Find Student by name");
            System.out.println("6. Display Student by Gender");
            System.out.println("0. Exit");
            System.out.println("Would you like to do something ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    StudentManager.creatStudentList();
                    break;
                case 2:
                    System.out.println("The student has highest point: ");
                    StudentManager.MaxPointStudent(students);
                    System.out.println("The student has lowest point: ");
                    StudentManager.MinPointStudent(students);
                    break;
                case 3:
                    System.out.println("Thêm sinh viên ");
                    StudentManager.addStudent(students);
                    break;
                case 4:
                    StudentManager.deleteStudent(students);
                    break;
                case 5:
                    StudentManager.searchStudent(students);
                    break;
                case 6:
                    System.out.println("Student of male");
                    StudentManager.showStudentMale(students);
                    System.out.println("Student of female");
                    StudentManager.showStudentFemale(students);
                    break;
                case 7:
                    Arrays.sort(students);
                    for (Student student:students) {
                        System.out.println(student);
                    }
                    break;
            }
        }
    }


}
