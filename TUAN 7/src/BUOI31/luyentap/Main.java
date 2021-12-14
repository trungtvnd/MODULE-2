package BUOI31.luyentap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Book[] books = new Book[9];
//        books[0] = new Book("a1", 10000, 1, "23/01/2021");
//        books[1] = new Book("a2", 20000, 2, "23/01/2021");
//        books[2] = new Book("a3", 30000, 3, "23/01/2021");
//        books[3] = new ScienceBook("a4", 40000, 4, "23/01/2021", "Trinh thám");
//        books[4] = new ScienceBook("a5", 50000, 5, "23/01/2021", "Trinh thám");
//        books[5] = new ScienceBook("a6", 60000, 6, "23/01/2021", "Ngôn tình");
//        books[6] = new NovelBook("a7", 70000, 7, "23/01/2021", "Trung");
//        books[7] = new NovelBook("a8", 80000, 8, "23/01/2021", "Trung");
//        books[8] = new NovelBook("a9", 90000, 9, "23/01/2021", "Tuấn");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sách cần tạo");
        int size = scanner.nextInt();
        Book[] books = new Book[size];
        ManagerBook managerBook = new ManagerBook(books);
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1.Thêm sách");
            System.out.println("2.Hiển thị tất cả sách");
            System.out.println("3.Hiển thị sách khoa học");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    int choice1;
                    do{
                        System.out.println("1.Thêm sách thường");
                        System.out.println("2.Thêm sách khoa học");
                        System.out.println("3.Thêm sách tiểu thuyết");
                        System.out.println("0. Exit");
                        System.out.println("Nhập lựa chọn của bạn: ");
                        choice1 = scanner.nextInt();
                        scanner.nextLine();
                        if(choice1 !=0){
                            System.out.println("Nhập vào tên sách");
                            String name = scanner.nextLine();
                            System.out.println("Nhập vào đơn giá của sách");
                            double price = scanner.nextDouble();
                            System.out.println("Nhập vào số lượng sách");
                            int amount = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhập vào ngày tạo sách");
                            String date = scanner.nextLine();
                            managerBook.addBook(scanner, choice1, name, price, amount, date);
                        }

                    }while (choice1 != 0);
                    break;
                case 2:
                    managerBook.displayAllBook();
                    break;
                case 3:
                    managerBook.displayScienceBook();
                    break;
            }
        }while (choice != 0);


    }

}
