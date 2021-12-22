package bai1;

import java.util.HashSet;
import java.util.Scanner;

public class QuanLyKhachSan {
    private HashSet<KhachSan> khachSans;

    public QuanLyKhachSan() {
        this.khachSans = new HashSet<>();
    }

    public QuanLyKhachSan(HashSet<KhachSan> khachSans) {
        this.khachSans = khachSans;
    }

    public void addKhachTro(KhachSan khachSan) {
        khachSans.add(khachSan);
    }

    public void createKhachTro(Scanner sc, int n) {
        int count = 1;
        while (count <= n) {
            sc.nextLine();
            System.out.println("Nhập thông tin");
            System.out.println("Nhập tên");
            String hoVaTen = sc.nextLine();
            System.out.println("Nhập ngày Sinh: ");
            String ngaySinh = sc.nextLine();
            System.out.println("Nhập số CMND");
            long soChungMinhThu = sc.nextLong();
            Nguoi nguoi = new Nguoi(hoVaTen, ngaySinh, soChungMinhThu);
            System.out.println("Nhập số ngày trọ");
            int soNgayTro = sc.nextInt();
            sc.nextLine();
            System.out.println("Loại phòng trọ (Đơn/Đôi/Luxury)");
            String loaiPhongTro = sc.nextLine();
            System.out.println("Nhập giá phòng ");
            double giaTro = sc.nextDouble();
            KhachSan khachSan = new KhachSan(nguoi, soNgayTro, loaiPhongTro, giaTro);
            khachSans.add(khachSan);
            count++;
        }

    }

    public void xoaKhachTro(Scanner sc) {
        System.out.println("Nhập số CMND:");
        int chungMinhThu = sc.nextInt();
        khachSans.removeIf(khachSan -> chungMinhThu == khachSan.getNguoi().getSoChungMinhThu());
    }

    public void suaKhachTro(Scanner sc) {
        System.out.println("Nhập số CMND:");
        int chungMinhThu = sc.nextInt();
        sc.nextLine();
        KhachSan suaKhachTro = null;
        Nguoi suaThongTinNguoi = null;
        boolean flag = false;
        for (KhachSan khachSan : khachSans) {
            if (chungMinhThu == khachSan.getNguoi().getSoChungMinhThu()) {
                flag = true;
                suaKhachTro = khachSan;
                suaThongTinNguoi = khachSan.getNguoi();
                System.out.println("Nhập thông tin");
                System.out.println("Nhập tên sửa");
                suaThongTinNguoi.setHoVaTen(sc.nextLine());
                System.out.println("Nhập ngày Sinh muốn sửa: ");
                suaThongTinNguoi.setNgaySinh(sc.nextLine());
                System.out.println("Nhập số CMND muốn sửa ");
                suaThongTinNguoi.setSoChungMinhThu(sc.nextLong());
                System.out.println("Nhập số ngày trọ muốn sửa");
                suaKhachTro.setSoNgayTro(sc.nextInt());
                sc.nextLine();
                System.out.println("Loại phòng trọ (Đơn/Đôi) muốn sửa");
                suaKhachTro.setLoaiPhongTro(sc.nextLine());
                sc.nextLine();
                System.out.println("Nhập giá phòng muốn sửa ");
                suaKhachTro.setGiaTro(sc.nextDouble());
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy khách hàng");
        }
    }

    public void hienThiKhachTro() {
        for (KhachSan khachSan : khachSans) {
            khachSan.display();
        }
    }

    public void thanhTien(Scanner sc) {
        System.out.println("Nhập số CMND cần tìm: ");
        long chungMinhThu = sc.nextLong();
        double thanhTien = 0;
        boolean flag = false;
        for (KhachSan khachSan : khachSans) {
            if (chungMinhThu == khachSan.getNguoi().getSoChungMinhThu()) {
                thanhTien += khachSan.getSoNgayTro() * khachSan.getGiaTro();
                System.out.println(thanhTien);;
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy khách hàng cần");
        }
    }

}
