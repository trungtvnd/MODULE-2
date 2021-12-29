package BUOI42.demo.dongbo3luong;

import javafx.scene.paint.RadialGradient;

public class Thread2 extends Thread {
    ShareData shareData;

    public Thread2(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        while (shareData.checkTotal()) {
            synchronized (shareData) {
                shareData.notifyAll();
                try {
                    while (shareData.getIndex()!=2&& shareData.checkTotal()){
                        shareData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int rad = shareData.getRad();
                if (rad % 3 == 0) {
                    rad *= rad;
                    System.out.println("T2>>>>: " + rad);
                }
                shareData.setIndex(1);
            }
            System.out.println("T2 stop");
            synchronized (shareData){
                shareData.notifyAll();
            }
        }
    }
}
