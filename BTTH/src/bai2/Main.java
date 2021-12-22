package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerInvoice managerInvoice = new ManagerInvoice();
        int choice;
        do {
            System.out.println("\n" +
                    "1. Add Customer\n" +
                    "2. Display all INVOICE \n" +
                    "0. Exit\n");
            System.out.println("input your choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập số hộ muốn nhập");
                    int n = sc.nextInt();
                    managerInvoice.createCustomer(sc,n);
                    break;
                case 2:
                    System.out.printf("%-20S%-20S%-20S%-20S%-20S%" +
                            "S\n", "Tên chủ hộ", "Địa chỉ", "Số công tơ", "Chỉ số cũ", "Chỉ số mới", "Thành Tiền");
                    managerInvoice.displayAllCustomer();
                    break;

            }
        }while (choice!=0);

    }
}
