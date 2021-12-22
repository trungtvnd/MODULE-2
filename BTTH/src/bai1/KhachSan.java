package bai1;

public class KhachSan {
    private int soNgayTro;
    private String loaiPhongTro;
    private double giaTro;
    private Nguoi nguoi;

    public KhachSan() {
    }

    public KhachSan(Nguoi nguoi, int soNgayTro, String loaiPhongTro, double giaTro ) {
        this.soNgayTro = soNgayTro;
        this.loaiPhongTro = loaiPhongTro;
        this.giaTro = giaTro;
        this.nguoi = nguoi;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setLoaiPhongTro(String loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public double getGiaTro() {
        return giaTro;
    }

    public void setGiaTro(double giaTro) {
        this.giaTro = giaTro;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }

    public void display(){
        System.out.printf("%-20s", nguoi.getHoVaTen());
        System.out.printf("%-20s", nguoi.getNgaySinh());
        System.out.printf("%-20s", nguoi.getSoChungMinhThu());
        System.out.printf("%-20d", soNgayTro);
        System.out.printf("%-20S", loaiPhongTro);
        System.out.printf("%-20.2f\n", giaTro);

    }
}
