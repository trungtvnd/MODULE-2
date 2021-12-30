package BUOI42.demo.baitap;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println((int) 'a');

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        for (int i = 0; i < thread1.integerArrayList.size(); i++) {
            System.out.print(thread1.integerArrayList.get(i));
        }for (int i = 0; i < thread2.characters.size(); i++) {
            System.out.print(thread2.characters.get(i));
        }

    }
}
