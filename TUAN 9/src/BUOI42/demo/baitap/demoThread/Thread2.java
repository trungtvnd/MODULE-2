package BUOI42.demo.baitap;

import java.util.ArrayList;
import java.util.Random;

public class Thread2 extends Thread{
ArrayList<Character> characters = new ArrayList<>();
    @Override
    public void run() {
        int min = (int) 'a';
        int max = (int) 'z';
        int limit = max - min;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rad = random.nextInt(limit) + min;
            char c = (char) rad;

            characters.add(c);
            System.out.println("T2>>>: "+ c);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
