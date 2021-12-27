package BUOI42.baitap.product;

import BUOI42.demo.ObjectOutputStreamExample;
import BUOI42.thuchanh.readAndWriteStudentList.Student;

import java.io.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> products = new ArrayList<>();

    public ProductManager() {
    }

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
    public void displayProduct(){
        for (Product product:products) {
            System.out.println(product);
        }
    }

    public void createProduct(Scanner sc) {

        sc.nextLine();
        System.out.println("Input name Product"); String name = sc.nextLine();
        System.out.println("Input Manufacture"); String manufacture = sc.nextLine();
        System.out.println("input price");
        double price = sc.nextDouble();
        Product product = new Product(name, manufacture, price);
        for (Product product1:products) {
            if(product.getId() == product1.getId()){
                System.out.println("Id đã tồn tại");
            }
        }
        addProduct(product);
    }

    public void editProduct(Scanner sc) {
        Product productEdit = new Product();
        System.out.println("Input id wwant to edit");
        int id = sc.nextInt();
        for (Product product : products) {
            if (id == product.getId()) {
                productEdit = product;
                System.out.println("Input new name Product");
                productEdit.setName(sc.nextLine());
                System.out.println("Input new Manufacture");
                productEdit.setManufacture(sc.nextLine());
                sc.nextLine();
                System.out.println("input new price");
                productEdit.setPrice(sc.nextDouble());
            }
        }

    }

    public void deleteProduct(Scanner sc) {
        Product productEdit = new Product();
        System.out.println("Input id want to edit");
        int id = sc.nextInt();
        products.removeIf(product -> id == product.getId());
    }
    public void writeObjectToFile(File file){
            try{
                OutputStream os = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(products);
                oos.flush();
                oos.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
    }

    public void readObjectFromFile (File file) throws ClassNotFoundException {

        try{
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            products = (ArrayList<Product>) ois.readObject();
            ois.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        for (Product product:products) {
            System.out.println(product);
        }

    }

}
