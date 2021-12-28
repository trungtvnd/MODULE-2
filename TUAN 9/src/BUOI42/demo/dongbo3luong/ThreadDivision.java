package BUOI42.demo.dongbo3luong;

public class ThreadDivision extends Thread {
    ShareData shareData;

    public ThreadDivision(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {

        while (shareData.checkTotal()) {
            synchronized (shareData) {
                shareData.notifyAll();
                try {
                    do {
                        shareData.wait();
                    } while (shareData.getIndex() != 3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int rad = shareData.getRad();
                if (rad % 2 == 0) {
                    if (rad % 4 == 0) {
                        System.out.println("T3 >>> chia hết cho 4: " + rad);
                    } else {
                        System.out.println("khong chia hết cho 4: ");
                    }
                    shareData.setIndex(1);
                }
            }
        }
    }
}
