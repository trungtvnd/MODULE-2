package BUOI43.baitap.baitapthem;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        int choice;
        do{
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
