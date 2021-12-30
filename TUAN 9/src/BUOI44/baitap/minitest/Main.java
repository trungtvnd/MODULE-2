package BUOI44.baitap.minitest;

import BUOI43.baitap.baitapthemreview.ManagerStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        int choice;
        do{

            System.out.println("❀❀❀❀❀❀❀❀❀❀ ●▬▬▬▬๑۩۩๑▬▬▬▬▬● ❀❀❀❀❀❀❀❀❀❀❀❀");
            System.out.println("❀       1. Add Student                                ❀");
            System.out.println("❀       2. Edit Student                               ❀");
            System.out.println("❀       3. DeleteStudent                              ❀");
            System.out.println("❀       4. Search by ID                               ❀");
            System.out.println("❀       5. Display By increase AvgPoint               ❀");
            System.out.println("❀       6. Display By increase AvgPoint               ❀");
            System.out.println("❀       7. Display Student has Highest Point          ❀");
            System.out.println("❀       8. Display All                                ❀");
            System.out.println("❀       9. Write file                                 ❀");
            System.out.println("❀       10. Read File                                 ❀");
            System.out.println("❀       0. Exit                                       ❀");
            System.out.println("❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀❀❀❀❀❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀");
            System.out.println("In put your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                   studentManager.createStudent(sc);
                    break;
                case 2:
                    studentManager.editStudent(sc);
                    break;
                case 3:
                    studentManager.deleteStudent(sc);
                    break;
                case 4:
                    studentManager.searchStudent(sc);
                    break;
                case 5:
                    studentManager.sortByAvgPointIncrease();
                    break;
                case 6:
                    studentManager.sortByAvgPointdecrease();
                    break;
                case 7:
                    studentManager.highestPoint();
                    break;
                case 8:
                    studentManager.displayAll();
                    break;
                case 9:
                    studentManager.writeToFile(StudentManager.PATH_NAME);
                    break;
                case 10:
                    ArrayList<Student> students = studentManager.readFile(StudentManager.PATH_NAME);
                    students.forEach(System.out::println);
                    break;
            }

        }while (choice!=0);
    }
    }

