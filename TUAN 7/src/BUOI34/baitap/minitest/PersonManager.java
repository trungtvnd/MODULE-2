package BUOI34.baitap.minitest;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager implements Manager{
    private ArrayList<Person> persons;
    private static int index = 0;

    public PersonManager(ArrayList<Person> persons) {
        this.persons = persons;
    }

    @Override
    public void displayStudent() {
        for (Person person:persons) {
            System.out.println(person);
        }
        System.out.println("-----------");
    }

    @Override
    public void addStudent() {
        for (int i = 0; i < persons.size(); i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập thông tin: ");
            System.out.println("Nhập tên");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Nhập tuổi");
            int age = scanner.nextInt();
            persons.set(i, new Student(name, age));
            for (Person person:persons) {
                System.out.println(person);
            }
        }
    }

    @Override
    public void searchStudent() {
        InputStream src;
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public void editStudent() {

    }

    @Override
    public void sortStudent() {

    }

    @Override
    public void totalPoint() {

    }
}
