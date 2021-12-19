package BUOI34.baitap.minitestReview;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();
        int choice;
        do {
            System.out.println("----------Menu----------");
            System.out.println("1. Add Human");
            System.out.println("2. Display Human ");
            System.out.println("3. Search Human");
            System.out.println("4. Delete Human");
            System.out.println("5. Edit Human");
            System.out.println("6. Sort by avgPoint");
            System.out.println("7. Total avg Point");
            System.out.println("0. Exit");
            System.out.println("in put your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    managerStudent.creatHuman(sc, managerStudent);
                    break;
                case 2:
                    managerStudent.display();
                    break;
                case 3:
                    managerStudent.searchPerson(sc);
                    break;
                case 4:
                    managerStudent.deletePerson(sc);
                    break;
                case 5:
                    managerStudent.updatePerson(sc);
                    break;
                case 6:
                    managerStudent.sortPerson();
                    break;
                case 7:
                    managerStudent.Total();
                    break;
            }
        } while (choice != 0);

    }
}
