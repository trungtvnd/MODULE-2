package BUOI42.demo.dongbo3luong;

public class Main {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();

        Thread1 t1 = new Thread1(shareData);
        Thread2 t2 = new Thread2(shareData);
        Thread3 t3 = new Thread3(shareData);

        t1.start();
        t2.start();
        t3.start();
    }

}
