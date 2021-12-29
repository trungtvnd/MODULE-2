package BUOI42.demo.dongbo3luong;

public class Thread3 extends Thread {
    ShareData shareData;

    public Thread3(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        while (shareData.checkTotal()) {
            synchronized (shareData) {
                shareData.notifyAll();
                try {
                    while (shareData.getIndex()!=3&& shareData.checkTotal()){
                        shareData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int rad = shareData.getRad();
                if (rad % 2 == 0) {
                    if (rad % 4 == 0) {
                        System.out.println("Số ngẫu nhiên chia hết cho 4");
                    } else {
                        System.out.println("Số ngẫu nhiên không chia hết cho 4");
                    }
                }else {
                    System.out.println("Đây là số lẻ");
                }
                shareData.setIndex(1);
            }
            System.out.println("T3 stop");
            synchronized (shareData){
                shareData.notifyAll();
            }
        }
    }
}
