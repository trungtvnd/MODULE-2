package BUOI42.demo.dongbo;

import java.util.Random;

public class ThreadRandom extends Thread {
    ShareData shareData;

    public ThreadRandom(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println("T1 >>>" + i);
            synchronized (shareData) {
                int rad = random.nextInt(100) + 1;
                shareData.setRad(rad);
                System.out.println("Số ngẫu nhieen" + rad);

                try {
                    shareData.notifyAll();
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        synchronized (shareData){
            shareData.notifyAll();
        }

    }
}
