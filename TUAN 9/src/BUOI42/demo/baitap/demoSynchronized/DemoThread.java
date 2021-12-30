package BUOI42.demo.baitap.demoSynchronized;

import java.util.Random;

public class DemoThread extends  Thread{
    Demo demo = new Demo();

    public DemoThread(Demo demo) {
        this.demo = demo;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
                int rad = random.nextInt(5) +1;
                demo.add(rad);
            }
        }
    }

