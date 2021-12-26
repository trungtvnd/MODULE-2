package BUOI42.thuchanh.readAndWriteStudentList;

import BUOI42.demo.ObjectOutputStreamExample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile(students);

        List<Student> studentDataFromFile = readObjectFromFile();
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }

    }

    public static void writeToFile(List<Student> students) {
//        src/BUOI42/thuchanh/readAndWriteStudentList/writeFile.txt
        try {
            OutputStream os = new FileOutputStream("src/BUOI42/thuchanh/readAndWriteStudentList/writeFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(students);
            oos.flush();
            oos.close();
            os.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static List<Student> readObjectFromFile() {
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 9\\src\\BUOI42\\thuchanh\\readAndWriteStudentList\\writeFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }

}
