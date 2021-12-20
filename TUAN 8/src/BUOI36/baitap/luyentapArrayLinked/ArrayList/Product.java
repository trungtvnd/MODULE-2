package BUOI36.baitap.luyentapArrayLinked.ArrayList;

public class Product implements Comparable<Product>{
    private static int VALUE = 0;
    private int id;
    private String name;
    private String type;
    private double price;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id= " + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, String type, double price) {
        this.id = ++VALUE;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        if(this.price > o.getPrice()){
            return -1;
        }else if(this.price < o.getPrice()){
            return 1;
        }
        return 0;
    }
}
