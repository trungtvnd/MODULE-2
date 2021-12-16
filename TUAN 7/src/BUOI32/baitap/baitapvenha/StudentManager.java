package BUOI32.baitap.baitapvenha;

import java.util.Scanner;

public class StudentManager {
    private Student[] students;


    public StudentManager(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public StudentManager() {
    }
    public static void creatStudentList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of Student: ");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Input the " + (i +1) + "Student");
            students[i] = addStudent(scanner);
        }
        for (Student student:students) {
            System.out.println(student);
        }
    }

    public static Student addStudent(Scanner input){
        System.out.println("Input Information");
        System.out.println("Input name: ");
        String name = input.next();
        input.nextLine();
        System.out.println("Input age: ");
        int age = input.nextInt();
        System.out.println("Input gender: ");
        String gender = input.next();
        System.out.println("Input Address: ");
        String address = input.nextLine();
        input.nextLine();
        System.out.println("Input average Point");
        double averagePoint = input.nextDouble();
        return new Student(name, age, gender, address, averagePoint);
    }
    public static void MaxPointStudent(Student[] students){
        double maxPoint = students[0].getAveragePoint();
        for (Student student:students) {
            if(maxPoint < student.getAveragePoint()){
                maxPoint = student.getAveragePoint();
            }
        }
        System.out.println("The student have highest Point : ");
        for (Student student:students) {
            if(maxPoint == student.getAveragePoint()){
                System.out.println(student);
            }

        }
    }
    public static void MinPointStudent(Student[] students){
        double minPoint = students[0].getAveragePoint();
        for (Student student:students) {
            if(minPoint > student.getAveragePoint()){
                minPoint = student.getAveragePoint();
            }
        }
        System.out.println("Students have lowest Point: ");
        for (Student student:students) {
            if(minPoint == student.getAveragePoint()){
                System.out.println(student);
            }

        }
    }
    public static void addStudent(Student[] students){
        int j = 0;
        Student[] students1 = new Student[students.length +1];
        Scanner input = new Scanner(System.in);
        System.out.println("Input name student: ");
        String name = input.next();
        input.nextLine();
        System.out.println("Input age: ");
        int age = input.nextInt();
        System.out.println("Input gender: ");
        String gender = input.next();
        System.out.println("Input Address: ");
        String address = input.nextLine();
        input.nextLine();
        System.out.println("Input average Point");
        double averagePoint = input.nextDouble();
        for (int i = 0; i < students1.length; i++) {
            if(i == students.length){
                students1[i] = new Student(name, age, gender, address, averagePoint);
            }else {
                students1[i] = students[j];
                j++;
            }
        }

        for (Student student:students1) {
            System.out.println(student);
        }
    }

    public static void deleteStudent(Student[] students){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm");
        String name = input.nextLine();
       int indexDelete =  searchToDelete(students, name);
       if(indexDelete == -1){
           System.out.println("not found information student");
       }else {
           Student[] studentsNew = new Student[students.length -1];
           for (int i = 0; i < indexDelete; i++) {
               studentsNew[i] = students[i];
           }
           for (int i = indexDelete +1; i < students.length ; i++) {
               studentsNew[i-1] = students[i];
           }
           for (Student student:studentsNew) {
               System.out.println(student);
           }
       }

    }
    private static int searchToDelete(Student[] students, String name) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
        if(name.equals(students[i].getName())){
            index = i;
        }
        }return index;
    }

    public static void searchStudent(Student[] students){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        System.out.println("Input name you want to search: ");
        String name = input.nextLine();
        for (Student student:students) {
            if(name.equals(student.getName())){
                System.out.println(student);
                check = true;
            }
        }if(!check){
            System.out.println("Not Found student");
        }
    }
    public static void showStudentMale(Student[] students){
        String male = "Nam";

        for (Student student:students) {
            if(male.equals(student.getGender())){
                System.out.println(student);
            }
        }
    }
    public static void showStudentFemale(Student[] students){
        String female = "Nữ";
        for (Student student:students) {
            if(female.equals(student.getGender())){
                System.out.println(student);
            }
        }
    }

}
