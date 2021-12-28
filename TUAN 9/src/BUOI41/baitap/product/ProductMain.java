package BUOI41.baitap.product;

import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) throws ClassNotFoundException {
        ProductManager productManager = new ProductManager();
        InputStream src;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("-----------");
            System.out.println("=========MENU==========");
            System.out.println("" +
                    "1. Add\n" +
                    "2. Edit\n" +
                    "3. Delete\n" +
                    "4. Save File\n" +
                    "5. Read File\n" +
                    "6. Display\n" +
                    "\n");
            System.out.println("Input your choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    productManager.createProduct(sc);

                    break;
                case 2:
                    productManager.editProduct(sc);
                    break;
                case 3:
                    productManager.deleteProduct(sc);
                    break;
                case 4:
                    File file = new File("src/BUOI42/baitap/product/saveFile.txt");
                    productManager.writeObjectToFile(file);
                    break;
                case 5:
                    File file1 = new File("src/BUOI42/baitap/product/saveFile.txt");
                    productManager.readObjectFromFile(file1);
                    break;
                case 6:
                    productManager.displayProduct();
                    break;
            }

        }while (choice!=0);

    }
}
