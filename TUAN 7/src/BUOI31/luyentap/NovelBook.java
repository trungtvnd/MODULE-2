package BUOI31.luyentap;

public class NovelBook extends Book {
    private String author;

    public NovelBook(String a7, int price, int amount, String s, String trung) {
    }

    public NovelBook(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public NovelBook(String name, double price, int amount, String date, String author){
        super(name, price, amount, date);
        this.author = author;

    }

    @Override
    public String toString() {
        return "NovelBook{" +
                super.toString() +
                "author='" + author + '\'' +
                '}';
    }
}
