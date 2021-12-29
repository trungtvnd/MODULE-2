package BUOI42.demo.dongbo3luong;

public class ShareData {
    int rad;
    int total;
    int index;

    public ShareData() {
        total = 0;
        index = 1;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public synchronized void plus(int value){
        total += value;
    }
    public synchronized boolean checkTotal(){
        return total<200;
    }

}
