package BUOI42.demo.dongbo3luong;

public class Main {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        ThreadRandom threadRandom = new ThreadRandom(shareData);
        ThreadSquare threadSquare = new ThreadSquare(shareData);
        ThreadDivision threadDivision = new ThreadDivision(shareData);

        threadRandom.start();
        threadSquare.start();
        threadDivision.start();
    }
}
