package bai1;

public class Nguoi {

    private String hoVaTen;
    private String ngaySinh;
    private long soChungMinhThu;

    public Nguoi() {
    }

    public Nguoi(String hoVaTen, String ngaySinh, long soChungMinhThu) {
        this.soChungMinhThu = soChungMinhThu;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
    }

    public long getSoChungMinhThu() {
        return soChungMinhThu;
    }

    public void setSoChungMinhThu(long soChungMinhThu) {
        this.soChungMinhThu = soChungMinhThu;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void displayNguoi(){
        System.out.printf("%-20S", hoVaTen);
        System.out.printf("%-20S", ngaySinh);
        System.out.printf("%-20d", soChungMinhThu);


    }
}
