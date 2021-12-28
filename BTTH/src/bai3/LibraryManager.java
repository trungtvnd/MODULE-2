package bai3;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<Library> libraryArrayList = new ArrayList<>();

    public LibraryManager() {
    }

    public LibraryManager(ArrayList<Library> libraryArrayList) {
        this.libraryArrayList = libraryArrayList;
    }

    public void addLibrary(Library library){
        libraryArrayList.add(library);
    }
    public void createLibrary(Scanner sc){
        System.out.println("Nhập thông tin cần tạo mới");
        String numberOfNote = sc.nextLine();
        System.out.println("Nhập ngày mượn định dang dd/MM/yyyy");  String beginDate = sc.nextLine();
        System.out.println("Nhập ngày đến hạn định dang dd/MM/yyyy"); String expireDate = sc.nextLine();
        System.out.println("Nhập mã sinh viên"); int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên"); String name = sc.nextLine();
        System.out.println("Nhập ngày sinh"); String birth = sc.nextLine();
        System.out.println("Nhập lớp"); String classStudent = sc.nextLine();
        Student student = new Student(id, name, birth, classStudent);
        Library library = new Library(numberOfNote, beginDate, expireDate, student);
        libraryArrayList.add(library);
    }
    public void lastDayOfMonth(){
        Date date1 = new Date();
        DateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String todayDate = dateFormat.format(date1);
        LocalDate convertedDate = LocalDate.parse(todayDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        convertedDate = convertedDate.withDayOfMonth(
                convertedDate.getMonth().length(convertedDate.isLeapYear()));
    }
    public void checkDate(String date){

    }


}
