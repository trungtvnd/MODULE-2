package BUOI39.miniTest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();


        int choice;

        do {
            System.out.println("---------------------");
            System.out.println("==============MENU=============");
            System.out.println("" +
                    "1. Add Student\n" +
                    "2. Delete Student\n" +
                    "3. Edit Student\n" +
                    "4. Total sort average Point\n" +
                    "5. The highest Point Student\n" +
                    "0. Exit\n" +
                    "\n");
            System.out.println("Input your choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    managerStudent.createStudent(sc);
                    break;
                case 2:
                    managerStudent.deleteStudent(sc);
                    break;
                case 3:
                    managerStudent.editStudent(sc);
                    break;
                case 4:

                    break;
                case 5:
                    managerStudent.dispalyStudentByPoint();
                    break;

                case 6:
                    managerStudent.displayStudent();
                    break;

            }

        }while (choice!=0);
    }
}
