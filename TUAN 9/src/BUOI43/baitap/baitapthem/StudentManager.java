package BUOI43.baitap.baitapthem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public StudentManager() {

    }

    public void creatStudent(Scanner sc) {
        System.out.println("Input Name");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Input age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Input gender");
        String gender = sc.nextLine();
        System.out.println("Input Address");
        String address = sc.nextLine();
        sc.nextLine();
        System.out.println("Input avg Point");
        double avgPoint = sc.nextDouble();
        Human student = new Student(name, age, gender, address, avgPoint);
        studentArrayList.add((Student) student);
    }

    public void displayStudent() {
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
    }

    public void deleteStudent(Scanner sc) {
        System.out.println("Input id you want to delete");
        int id = sc.nextInt();
        Student studentDelete = null;
        for (Student student : studentArrayList) {
            if (id == student.getId()) {
                studentDelete = student;
            }
        }
        studentArrayList.remove(studentDelete);
    }

    public void editStudent(Scanner sc) {
        Student studentEdit = null;
        System.out.println("Input ID you want to edit");
        int id = sc.nextInt();
        for (Student student : studentArrayList) {
            if (id == student.getId()) {
                studentEdit = student;
                sc.nextLine();
                System.out.println("Input new name");
                studentEdit.setName(sc.nextLine());

                System.out.println("Input new age: ");
                studentEdit.setAge(sc.nextInt());
                sc.nextLine();

                System.out.println("Input new Gender: ");
                studentEdit.setGender(sc.nextLine());

                System.out.println("Input new Address: ");
                studentEdit.setAddress(sc.nextLine());

                System.out.println("Input  new avg point: ");
                studentEdit.setAvgPoint(sc.nextDouble());
            }
        }
    }

    public void displayByAvgPoint(){
    ArrayList<Student> studentByPoint = new ArrayList<>();
        for (Student student:studentArrayList) {
            if(student.getAvgPoint() >= 7.5){
                studentByPoint.add(student);
            }
        }
        for (Student student:studentByPoint) {
            System.out.println(student);
        }
    }

    public void displayBySort(){
        for (Student student:studentArrayList) {
            student.displayByXepLoai();
        }

    }

    public void saveInfor() {
        File file = new File("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 9\\src\\BUOI43\\baitap\\baitapthem\\saveFile.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bf = new BufferedWriter(fw);
            for (Student student : studentArrayList) {
                bf.write(student.displayInformation());
            }
            bf.flush();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readInfor(){
        File file = new File("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 9\\src\\BUOI43\\baitap\\baitapthem\\saveFile.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}