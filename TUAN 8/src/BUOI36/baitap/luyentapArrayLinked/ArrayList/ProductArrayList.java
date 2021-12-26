package BUOI36.baitap.luyentapArrayLinked.ArrayList;


//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class ProductArrayList {
//    private ArrayList<Product> productArrayList = new ArrayList<>();
//
//    public ProductArrayList() {
//    }
//
//    public ProductArrayList(ArrayList<Product> productArrayList) {
//        this.productArrayList = productArrayList;
//    }
//
//    public void addProduct(Product product) {
//        productArrayList.add(product);
//    }
//    public void creatProduct(Scanner sc, ProductArrayList productArrayList){
//        System.out.println("input innformation ");
//        System.out.println("Input name: ");
//        String name = sc.nextLine();
//        System.out.println("input Type");
//        String type = sc.nextLine();
//        System.out.println("input price");
//        double price = sc.nextDouble();
//        Product product = new Product(name, type, price);
//        productArrayList.addProduct(product);
//    }
//
//    public void displayAll() {
//        for (Product product :productArrayList) {
//            System.out.println(product);
//        }
//    }
//    public void deleteProduct(Scanner sc){
//        System.out.println("Input id product want to delete");
//        int id = sc.nextInt();
//        productArrayList.removeIf(product -> id == product.getId());
//    }
//
//    public void editProduct(Scanner sc){
//        System.out.println("In put id want to edit");
//        int id =sc.nextInt();
//        Product productEdit=null;
//        for (Product product:productArrayList) {
//            if(product.getId() == id){
//                productEdit = product;
//                System.out.println("Nhập tên mới");
//                productEdit.setName(sc.nextLine());
//                sc.nextLine();
//                System.out.println("Nhập Loại mới");
//                productEdit.setType(sc.nextLine());
//                System.out.println("Nhập giá");
//                productEdit.setPrice(sc.nextDouble());
//            }
//
//        }
//
//    }
//
//    public void searchProduct(Scanner sc){
//        System.out.println("Input name Product");
//        String name = sc.nextLine();
//        for (Product product: productArrayList) {
//            if(name.equals(product.getName())){
//                System.out.println(product);
//            }
//        }
//
//    }
//    public void sort(){
//        Collections.sort(productArrayList);
//        displayAll();
//    }
//
//}
