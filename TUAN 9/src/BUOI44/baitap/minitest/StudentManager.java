package BUOI44.baitap.minitest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 9\\src\\BUOI44\\baitap\\minitest\\saveFile.csv";
    private ArrayList<Student> studentArrayList;

    public StudentManager() {
        this.studentArrayList = readFile(PATH_NAME);
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public void createStudent(Scanner sc){
        sc.nextLine();
        System.out.println("Input name: "); String name = sc.nextLine();
        System.out.println("input age: "); int age = sc.nextInt();
        System.out.println("Input Math Point: "); double mathPoint = sc.nextDouble();
        System.out.println("Input Math Point: "); double physicalPoint = sc.nextDouble();
        System.out.println("Input Math Point: "); double chemicalPoint = sc.nextDouble();

        Human student = new Student(name, age, mathPoint, physicalPoint, chemicalPoint);
        studentArrayList.add((Student) student);
        writeToFile(PATH_NAME);

    }

    public void editStudent(Scanner sc){
        System.out.println("input id you want to edit");
        int id = sc.nextInt();
        sc.nextLine();
        Student studentEdit = null;
        for (Student student:studentArrayList) {
            if(id == student.getId()){
                studentEdit = student;
                System.out.println("Input name: "); studentEdit.setName(sc.nextLine());
                sc.nextLine();
                System.out.println("input age: "); studentEdit.setAge(sc.nextInt());
                System.out.println("Input Math Point: "); studentEdit.setMathPoint(sc.nextDouble());
                System.out.println("Input Math Point: "); studentEdit.setPhysicalPoint(sc.nextDouble());
                System.out.println("Input Math Point: "); studentEdit.setChemicalPoint(sc.nextDouble());
                writeToFile(PATH_NAME);
            }
        }
    }

    public void deleteStudent(Scanner sc){
        System.out.println("input id you want to edit");
        int id = sc.nextInt();
        Student studentDelete = null;
        for (Student student:studentArrayList) {
            if(id == student.getId()){
                studentDelete = student;
            }
        }
        studentArrayList.remove(studentDelete);
        writeToFile(PATH_NAME);
    }
    public void displayAll(){
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
    }

    public void sortByAvgPointIncrease(){
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAvgPoint() > o2.getAvgPoint()){
                    return 1;
                }else if(o1.getAvgPoint() < o2.getAvgPoint()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        displayAll();
    }

    public void searchStudent(Scanner sc){
        System.out.println("input id you want to edit");
        int id = sc.nextInt();
        for (Student student:studentArrayList) {
            if(id == student.getId()){
                System.out.println(student);
            }
        }
    }
    public void sortByAvgPointdecrease(){
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAvgPoint() < o2.getAvgPoint()){
                    return 1;
                }else if(o1.getAvgPoint() > o2.getAvgPoint()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        displayAll();
    }
    public void highestPoint(){
        double max = studentArrayList.get(0).getAvgPoint();
        for (Student student:studentArrayList) {
            if(max < student.getAvgPoint()){
                max = student.getAvgPoint();
                System.out.println(student);
            }
        }
    }
    public void writeToFile(String path){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (Student student:studentArrayList) {
                bw.write(student.getName() + "," + student.getAge()
                        + "," + student.getMathPoint() + "," + student.getPhysicalPoint() + ","
                        + student.getChemicalPoint() +"\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> readFile(String path){
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine())!=null){
                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), Double.parseDouble(strings[2]), Double.parseDouble(strings[3]), Double.parseDouble(strings[4])));
                Human.IDC = checkMax(students);
            }
        }catch (Exception e){
            System.err.println();
        }
        return students;
    }
    public int checkMax(ArrayList<Student> students){
        int max = students.get(0).getId();
        for (Student student:students) {
            if(max < student.getId()){
                max = student.getId();
            }
        }return max;
    }

}
