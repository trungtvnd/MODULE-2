package BUOI42.baitap.product;

import java.io.Serializable;

public class Product implements Serializable {
    private static int CODE = 0;
    private int id;
    private String name;
    private String manufacture;
    private double price;

    public Product() {
    }

    public Product(String name, String manufacture, double price) {
        this.id = ++CODE;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                '}';
    }
}
