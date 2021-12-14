package BUOI31.luyentap;

public class ScienceBook extends Book {
    private String type;

    public ScienceBook(String a4, int price, int amount, String s, String trinh_thám) {
    }

    public ScienceBook(String type) {
        this.type = type;
    }
    public ScienceBook(String name, double price, int amount, String date, String type){
        super(name, price, amount, date);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ScienceBook{" +
                super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
