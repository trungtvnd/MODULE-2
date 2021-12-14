package BUOI31.luyentap;

import java.util.Scanner;
import java.util.jar.Manifest;

public class ManagerBook {
    private Book[] books;
    private static int index = 0;
    public ManagerBook(){}
    public ManagerBook(Book[] books){
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    public void addBook(Scanner scanner, int choice, String name, double price, int amount, String date){
        if(choice == 1){
            Book book = new Book(name, price, amount, date);
            books[index] = book;
            index++;
        }else if(choice == 2){
            System.out.println("Nhập vào thể loại của sách");
            String type = scanner.nextLine();
            ScienceBook scienceBook = new ScienceBook(name, price, amount, date, type);
            books[index] = scienceBook;
            index++;
        }else if(choice == 3){
            System.out.println("Nhập vào tác giả của sách");
            String author = scanner.nextLine();
            NovelBook novelBook = new NovelBook(name, price, amount, date, author);
            books[index] = novelBook;
            index++;
        }
    }
    public void displayScienceBook(){
        boolean check = false;
        System.out.println("Các quyển sách khoa học là: ");
        for (Book book:books) {
            if(book instanceof ScienceBook){
                check = true;
                System.out.println(book);
            }
        }
        if(!check){
            System.out.println("Not Found");
        }
        System.out.println("---------------");
    }

    public void displayNovelBook(){
        boolean check = false;
        System.out.println("Các quyển sách khoa học là: ");
        for (Book book:books) {
            if(book instanceof NovelBook){
                check = true;
                System.out.println(book);
            }

        }
        if(!check){
            System.out.println("Không có quyển sách tiểu thuyết nào");
        }
    }

    public void displayAllBook() {
        System.out.println("Tất cả sách là: ");
        for (Book book : books) {
            boolean compareNull = book != null;
            if (compareNull) {
                System.out.println(book);
            }
        }
        System.out.println("---------------");
    }

    public void rangePrice(double minPrice, long maxPrice){
        boolean check = false;
        System.out.println("các quyển sách trong khoảng giá là: ");
        for (Book book:books) {
            boolean betweenTwoPrice = book.getPrice() >= minPrice && book.getPrice() <= maxPrice;
            if(betweenTwoPrice){
                check = true;
                System.out.println(book);
            }
        }
        if(!check){
            System.out.println("Không có sách thỏa mãn");
        }
    }

    public void searchByAuthor(String searchAuthor){
        boolean check = false;
        for (Book book:books) {
            if(book instanceof NovelBook){
                if(((NovelBook) book).getAuthor().equals(searchAuthor)){
                    check = true;
                    System.out.println(book);
                }
            }if(!check){
                System.out.println("Không có tác giả đó");
            }

        }
    }
}
