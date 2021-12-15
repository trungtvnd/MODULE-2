package BUOI33.baitap;

import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        int ngay = scanner.nextInt();
        System.out.println("Nhập tháng");
        int month = scanner.nextInt();
        System.out.println("Nhập năm");
        int year = scanner.nextInt();
        ngayTiepTheo(ngay, month, year);
    }
    public static boolean namNhuan(int year){
        if(year % 4 == 0){
            if( year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }
            }
        }else {
            return true;
        }
    return false;
    }
    public static  int dayOfMonth(int month, int year) {
        int day;
        if(month < 1 && month > 12 ){
            return -1;
        }
        else {
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30;
                    break;
                default:
                   boolean check = namNhuan(year);
                   if(check){
                       day = 29;
                   }else {
                       day = 28;
                   }
                   break;
            }
        }
        return day;
    }
    public static String ngayTiepTheo(int ngay, int month, int year){
        int day;
        day = dayOfMonth(month, year);
        if (day == -1 || ngay < 1 || ngay > day)
            return "-1";
        else
        {
            if (ngay < day)
                ngay++;
            else if (month != 12) {
                ngay = 1;
                month++;
            }
            else {
                ngay = month = 1;
                year++;
            }
        }
        return ngay + "/" + month + "/" + year;
    }

}
