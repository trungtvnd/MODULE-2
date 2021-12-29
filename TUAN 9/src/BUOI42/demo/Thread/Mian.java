package BUOI42.demo.Thread;

public class Mian {
    public static void main(String[] args) {
        System.out.println("Threat Main Start");
        CreatThread1 creatThread1 = new CreatThread1();
        creatThread1.start();

        System.out.println("------");

        CreateThreat2 createThreat2 = new CreateThreat2();
        Thread t = new Thread(createThreat2);
        t.start();
        try {
            creatThread1.join();
            t.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Main Stop");
    }
}
