package BUOI36.baitap.luyentapArrayLinked.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductArrayList productArrayList = new ProductArrayList();
       int choice;
       do{
           System.out.println("--------------------");
           System.out.println("===========MENU===========");
           System.out.println("\n" +
                   "1. Add Product\n" +
                   "2. Display product\n" +
                   "3. Delete product\n" +
                   "4. Edit product\n" +
                   "5. Search product\n" +
                   "0. Exit\n" +
                   "\n");
           choice = sc.nextInt();
           sc.nextLine();
           switch (choice){
               case 1:
                   productArrayList.creatProduct(sc,productArrayList);
                   System.out.println("thêm Thành công");
                   break;
               case 2:
                   productArrayList.displayAll();
                   break;
               case 3:
                   productArrayList.deleteProduct(sc);
                   break;
               case 4:
                   productArrayList.editProduct(sc);
                   break;
               case 5:
                   productArrayList.searchProduct(sc);
           }
       }while (choice!=0);

    }
}
