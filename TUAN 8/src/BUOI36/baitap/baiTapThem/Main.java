//package BUOI36.baitap.baiTapThem;
//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ManagerAnimals managerAnimals = new ManagerAnimals();
//        int choice = 0;
//
//        do{
//            System.out.println("---------------");
//            System.out.println("===========MENU===========");
//            System.out.println("\n" +
//                    "1. Thêm con vật\n" +
//                    "2. Xóa theo tên\n" +
//                    "3. Sửa theo tên\n" +
//                    "4. Hiển thị theo tên\n" +
//                    "5. Hiển thị tất cả\n" +
//                    "5.. Hiển thị theo Cân nặng\n" +
//                    "0. Exit\n" +
//                    "\n");
//            System.out.println("Nhap lua chon");
//            choice = sc.nextInt();
//            switch (choice){
//                case 1:
//                managerAnimals.creatAnimals(sc, managerAnimals);
//                break;
//                case 2:
//                    managerAnimals.deleteAnimal(sc);
//                    break;
//                case 3:
//                    managerAnimals.editAnimal(sc);
//                    break;
//                case 4:
//                    managerAnimals.displayMotCon(sc);
//                    break;
//                case 5:
//                    managerAnimals.display();
//                    break;
//            }
//
//        }while (choice!=0);
//    }
//}
