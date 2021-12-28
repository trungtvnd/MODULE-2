package BUOI42.demo.dongbo3luong;

public class ThreadSquare extends Thread {
    ShareData shareData;

    public ThreadSquare(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {

        while (shareData.checkTotal()) {
            synchronized (shareData) {
                shareData.notifyAll();
                try {
                    while (true){
                        shareData.wait();
                        if(shareData.getIndex() == 2)
                            break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int rad = shareData.getRad();
                if (rad % 3 == 0) {
                    rad *= rad;
                    System.out.println("T2 >>> " + rad);
                }
                shareData.setIndex(1);
            }
        }
    }
}
