package BUOI42.demo.baitap;

import java.util.ArrayList;
import java.util.Random;

public class Thread1 extends Thread{
    ArrayList<Integer> integerArrayList = new ArrayList<>();

    public Thread1() {
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rad = random.nextInt(10);
            integerArrayList.add(rad);

            System.out.println("T1>>: "+ rad);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
