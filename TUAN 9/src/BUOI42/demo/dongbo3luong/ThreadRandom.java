package BUOI42.demo.dongbo3luong;

import BUOI42.demo.dongbo.ThreadSquare;

import java.util.Random;

public class ThreadRandom extends Thread {
    ShareData shareData;

    public ThreadRandom(ShareData shareData) {
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
                int rad = random.nextInt();
                shareData.setRad(rad);
                shareData.plus(rad);
                System.out.println("t1 >>>>" + rad);
                if(rad % 3 == 0){
                    shareData.setIndex(2);
                }else {
                    shareData.setIndex(3);
                }


                shareData.notifyAll();
                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
