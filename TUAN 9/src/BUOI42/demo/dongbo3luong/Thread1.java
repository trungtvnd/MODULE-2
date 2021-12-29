package BUOI42.demo.dongbo3luong;

import java.util.Random;

public class Thread1 extends Thread {
    ShareData shareData;

    public Thread1(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Random random = new Random();
        while (shareData.checkTotal()) {
            synchronized (shareData) {
                int rad = random.nextInt(100) + 1;
                shareData.setRad(rad);
                shareData.plus(rad);
                System.out.println("T1>>> : " + rad);
                if (rad % 3 == 0) {
                    shareData.setIndex(2);
                } else {
                    shareData.setIndex(3);
                }
                shareData.notifyAll();
                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("T1 stop");
            synchronized (shareData){
                shareData.notifyAll();
            }
        }
    }
}
