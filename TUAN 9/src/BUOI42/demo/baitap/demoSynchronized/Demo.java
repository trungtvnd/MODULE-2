package BUOI42.demo.baitap.demoSynchronized;

public class Demo {
    private int x = 0;
    public synchronized void add(int plus){
            x += plus;
        System.out.println("Day so x" + x);
        for (int i = 0; i < x; i++) {
            System.out.print(" "+ i );
        }
    }
}
