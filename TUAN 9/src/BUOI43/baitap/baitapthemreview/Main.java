package BUOI43.baitap.baitapthemreview;

import BUOI43.baitap.baitapthem.StudentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  ManagerStudent managerStudent = new ManagerStudent();

        int choice;
        do{
            System.out.println("Nhập thông tin");
            System.out.println("❀❀❀❀❀❀❀❀❀❀ ●▬▬▬▬๑۩۩๑▬▬▬▬▬● ❀❀❀❀❀❀❀❀❀❀❀❀");
            System.out.println("❀       1. Tạo sinh viên mới                          ❀");
            System.out.println("❀       2. Hiển thị danh sách                         ❀");
            System.out.println("❀       3. Sửa theo tên                               ❀");
            System.out.println("❀       4. Xóa sinh viên                              ❀");
            System.out.println("❀       5. Hiển thị ra điểm TB trên 7.5               ❀");
            System.out.println("❀       6. Hiển thị ra Rank sinh viên                 ❀");
            System.out.println("❀       0. Exit                                       ❀");
            System.out.println("❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀❀❀❀❀❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀");
            System.out.println("In put your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    managerStudent.addStudent(sc);
                    break;
                case 2:
                    managerStudent.editStudent(sc);
                    break;
                case 3:
                    managerStudent.deleteStudent(sc);
                    break;
                case 4:
                    managerStudent.displayAll();
                    break;
                case 5:
                    managerStudent.displayByPoint();
                    break;
                case 6:
                    managerStudent.displayFormatString();
                    break;
                case 7:
                    managerStudent.saveFile();
                    break;
                case 8:
                   managerStudent.readFile();
                    break;
                case 9:

                    break;
            }

        }while (choice!=0);
    }
    }

