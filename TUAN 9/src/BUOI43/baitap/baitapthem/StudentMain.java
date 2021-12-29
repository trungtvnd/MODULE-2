package BUOI43.baitap.baitapthem;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        int choice;
        do{
            System.out.println("-------------------\n");
            System.out.println("============MENU============");
            System.out.println("" +
                    "1. Add Student\n" +
                    "2. Edit Student\n" +
                    "3. Delete Student\n" +
                    "4. Display all Student\n" +
                    "5. Display all Student sort by avgPoint\n" +
                    "6. Display the student by Xếp loại\n" +
                    "7. Save information\n" +
                    "8. Read information\n" +
                    "");
            System.out.println("In put your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    studentManager.creatStudent(sc);
                    break;
                case 2:
                    studentManager.editStudent(sc);
                    break;
                case 3:
                    studentManager.deleteStudent(sc);
                    break;
                case 4:
                    studentManager.displayStudent();
                    break;
                case 5:
                    studentManager.displayByAvgPoint();
                    break;
                case 6:
                    studentManager.displayBySort();
                    break;
                case 7:
                    studentManager.saveInfor();
                    break;
                case 8:
                    studentManager.readInfor();
                    break;
                case 9:

                    break;
            }

        }while (choice!=0);
    }
}
