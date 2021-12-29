package BUOI42.demo.Thread;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Start");

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("luồng 1: " + i);
                }
            }
        });
        t.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("luồng 2: " + i);
                }
            }
        });
        t2.start();


        System.out.println("End");
    }
}
