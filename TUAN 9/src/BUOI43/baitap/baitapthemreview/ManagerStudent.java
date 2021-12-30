package BUOI43.baitap.baitapthemreview;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStudent {
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public ManagerStudent() {
    }

    public boolean checkValue(int age, double avgPoint) {
        return age >= 18 && age <= 60 && avgPoint > 0 && avgPoint <= 10;
    }


    public String getGender(int choice) {
        String gender = "";
        switch (choice) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "FeMale";
                break;
        }
        return gender;
    }

    public void addStudent(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Input name"); String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Input age: "); int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input address: "); String address = scanner.nextLine();

        System.out.println("Input gender: Bạn muốn chọn giới tính nam hay nữ:  ");
        System.out.println("1. Male");
        System.out.println("2. FeMale");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("input avg Point");  double avgPoint = scanner.nextDouble();
        scanner.nextLine();

        if(checkValue(age, avgPoint)){
            Human student = new Student(name, age, getGender(choice), address, avgPoint);
            studentArrayList.add((Student) student);
        }else {
            System.out.println("Dữ liệu không đúng");
        }

    }

    public void editStudent(Scanner sc) {
        System.out.println("Input id you want to edit");
        int id = sc.nextInt();
        Student studentEdit = null;
        for (Student student : studentArrayList) {
            if (id == student.getId()) {
                studentEdit = student;
                int index = studentArrayList.indexOf(studentEdit);
                sc.nextLine();
                System.out.println("Input name"); studentEdit.setName(sc.nextLine());
                sc.nextLine();
                System.out.println("Input age: "); int age = sc.nextInt(); studentEdit.setAge(age);
                sc.nextLine();
                System.out.println("Input address: "); studentEdit.setAddress(sc.nextLine());

                System.out.println("Input gender: Bạn muốn chọn giới tính nam hay nữ:  ");
                System.out.println("1. Male");
                System.out.println("2. FeMale");
                int choice = sc.nextInt();
                studentEdit.setGender(getGender(choice));
                sc.nextLine();

                System.out.println("input avg Point");  double avgPoint = sc.nextDouble();
                sc.nextLine();

                if(checkValue(age, avgPoint)){
                    studentArrayList.set(index, studentEdit);
                }else {
                    System.out.println("Dữ liệu không đúng");
                }

            }
        }
    }

    public void deleteStudent(Scanner sc) {
        System.out.println("Input id");
        int id = sc.nextInt();
        Student studentDelete = null;
        for (Student student : studentArrayList) {
            if (id == student.getId()) {
                studentDelete = student;
            }
        }
        if (studentDelete != null) {
            studentArrayList.remove(studentDelete);
        }
    }

    public void displayAll() {
        if (studentArrayList.isEmpty()) {
            System.out.println("No data");
        } else {
            for (Student student : studentArrayList) {
                System.out.println(student);
            }
        }
    }

    public void displayByPoint() {
        if (studentArrayList.isEmpty()) {
            System.out.println("No data");
        } else {
            for (Student student : studentArrayList) {
                if (student.getAvgPoint() >= 7.5) {
                    System.out.println(student);
                }
            }
        }
    }

    public void displayFormatString() {
        if (studentArrayList.isEmpty()) {
            System.out.println("No data");
            return;
        }
        for (Student student : studentArrayList) {
            if (student.getAvgPoint() >= 8) {
                System.out.println(student.getName() + " - " + student.getAvgPoint() + " - " + "Good");
            } else if (student.getAvgPoint() >= 6.5) {
                System.out.println(student.getName() + " - " + student.getAvgPoint() + " - " + "Pretty");
            } else if (student.getAvgPoint() >= 4.5) {
                System.out.println(student.getName() + " - " + student.getAvgPoint() + " - " + "Normal");
            } else {
                System.out.println(student.getName() + " - " + student.getAvgPoint() + " - " + "Bad");
            }
        }
    }
    public void saveFile(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 9\\src\\BUOI43\\baitap\\baitapthemreview\\saveFile.csv"));
            for (Student student:studentArrayList) {
                bw.write(student.getName() + "," + student.getAge() + "," + student.getGender()+
                        student.getAddress()+ "," +student.getAvgPoint()+"\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> readFile(){
        File file = new File("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 9\\src\\BUOI43\\baitap\\baitapthemreview\\saveFile.csv");

        try{
            if (!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                BufferedReader br = null;
                try {
                    br = new BufferedReader(new FileReader("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 9\\src\\BUOI43\\baitap\\baitapthemreview\\saveFile.csv"));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                String line = "";
                while (true){
                    try {
                        if (!((line = br.readLine())!= null)){
                            String[] strings = line.split(",");
                            studentArrayList.add(new Student(strings[0], Integer.parseInt(strings[1]),strings[2], strings[3], Double.parseDouble(strings[4])));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }return studentArrayList;
    }

}



