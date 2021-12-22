package bai2;

import java.util.HashSet;
import java.util.Scanner;

public class ManagerInvoice {
    private HashSet<Invoice> invoiceHashSet = new HashSet<>();

    public ManagerInvoice() {
    }

    public ManagerInvoice(HashSet<Invoice> invoiceHashSet) {
        this.invoiceHashSet = invoiceHashSet;
    }

    public void addCustomer(Invoice invoice){
        invoiceHashSet.add(invoice);
    }
    public void createCustomer(Scanner sc, int n){
        int count = 1;
        while (count<=n){
            sc.nextLine();
            System.out.println("Nhập thông tin của hộ sử dụng");
            System.out.println("Tên của chủ hộ"); String ownName = sc.nextLine();
            System.out.println("Địa chỉ của hộ sử dụng"); String address = sc.nextLine();
            sc.nextLine();
            System.out.println("Nhập số công tơ của hộ sử dụng: "); int codeEnergyMeter = sc.nextInt();
            Family family = new Family(ownName, address, codeEnergyMeter);

            System.out.println("Nhập chỉ số cũ: "); int oldPoint = sc.nextInt();
            System.out.println("Nhập chỉ số mới: "); int newPoint = sc.nextInt();

            Invoice invoice = new Invoice(family, oldPoint, newPoint);
            invoiceHashSet.add(invoice);
            count++;
        }

    }
    public void displayAllCustomer(){
        for (Invoice invoice:invoiceHashSet) {
            invoice.displayInvoice();
        }
    }

}
