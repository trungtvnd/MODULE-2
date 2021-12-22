package bai2;

public class Invoice {
    private Family family;
    private int oldPoint;
    private int newPoint;
    private static double total;

    public Invoice() {
    }

    public Invoice(Family family, int oldPoint, int newPoint) {
        this.family = family;
        this.oldPoint = oldPoint;
        this.newPoint = newPoint;
        total = (this.newPoint - this.oldPoint) * 750;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public int getOldPoint() {
        return oldPoint;
    }

    public void setOldPoint(int oldPoint) {
        this.oldPoint = oldPoint;
    }

    public int getNewPoint() {
        return newPoint;
    }

    public void setNewPoint(int newPoint) {
        this.newPoint = newPoint;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void displayInvoice(){
        System.out.printf("%-20S", family.getOwnName());
        System.out.printf("%-20S", family.getAddress());
        System.out.printf("%-20d", family.getCodeEnergyMeter());
        System.out.printf("%-20d", oldPoint);
        System.out.printf("%-20d", newPoint);
        System.out.printf("%.2f\n", total);
    }
}
