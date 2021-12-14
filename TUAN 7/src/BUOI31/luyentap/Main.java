package BUOI31.luyentap;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[9];
        books[0] = new Book("a1", 10000, 1, "23/01/2021");
        books[1] = new Book("a2", 20000, 2, "23/01/2021");
        books[2] = new Book("a3", 30000, 3, "23/01/2021");
        books[3] = new ScienceBook("a4", 40000, 4, "23/01/2021", "Trinh thám");
        books[4] = new ScienceBook("a5", 50000, 5, "23/01/2021", "Trinh thám");
        books[5] = new ScienceBook("a6", 60000, 6, "23/01/2021", "Ngôn tình");
        books[6] = new NovelBook("a7", 70000, 7, "23/01/2021", "Trung");
        books[7] = new NovelBook("a8", 80000, 8, "23/01/2021", "Trung");
        books[8] = new NovelBook("a9", 90000, 9, "23/01/2021", "Tuấn");
    }
}
