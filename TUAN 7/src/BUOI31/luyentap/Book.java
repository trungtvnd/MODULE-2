package BUOI31.luyentap;



public class Book {
    private String name;
    private double price;
    private int amount;
    private String date;

    public Book() {
    }

    public Book(String name, double price, int amount, String date) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
