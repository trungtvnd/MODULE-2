package BUOI42.demo.dongbo;

public class ThreadSquare extends Thread {
    ShareData shareData;

    public ThreadSquare(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("t2>>>" + i);
            synchronized (shareData) {

                try {
                    shareData.notifyAll();
                    int rad = shareData.getRad();
                    rad *= rad;
                    System.out.println("Số BP" + rad);
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
