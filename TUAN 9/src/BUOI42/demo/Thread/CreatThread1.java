package BUOI42.demo.Thread;

public class CreatThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Luồng 1+ "+ i);
        }
    }
}
