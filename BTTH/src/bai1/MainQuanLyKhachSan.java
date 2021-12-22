package bai1;

import java.util.Scanner;

public class MainQuanLyKhachSan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyKhachSan quanLyKhachSan = new QuanLyKhachSan();
        int choice;
        do{
            System.out.println("---------------------\n");
            System.out.println("============MENU=============\n" +
                    "1. Add customer\n" +
                    "2. Delete Customer\n" +
                    "3. Edit Customer\n" +
                    "4. Display all customer\n"
                    );
            System.out.println("Input your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Input number Customer: ");
                    int n = sc.nextInt();
                    quanLyKhachSan.createKhachTro(sc, n);
                    break;
                case 2:
                    quanLyKhachSan.xoaKhachTro(sc);
                    break;
                case 3:
                    quanLyKhachSan.suaKhachTro(sc);
                    break;
                case 4:
                    System.out.printf("%-20S%-20S%-20S%-20S%-20S%S\n", "tên", "Ngày Sinh", "CMND", "Số ngày", "Loại Phòng", "Đon giá");
                    quanLyKhachSan.hienThiKhachTro();
                    break;
                case 5:
                    quanLyKhachSan.thanhTien(sc);
                    break;
            }

        }while (choice!=0);
    }
}
