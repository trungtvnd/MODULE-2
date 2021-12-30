package BUOI42.demo.baitap.demoSynchronized;

public class DemoMain {
    public static void main(String[] args) {
        Demo demo = new Demo();
        DemoThread demoThread = new DemoThread(demo);
        DemoThread demoThread1 = new DemoThread(demo);
        DemoThread demoThread2= new DemoThread(demo);
        DemoThread demoThread3= new DemoThread(demo);
        demoThread.start();
        demoThread1.start();
        demoThread2.start();
        demoThread3.start();

    }
}
