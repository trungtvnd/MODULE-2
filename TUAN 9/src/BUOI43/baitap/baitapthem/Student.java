package BUOI43.baitap.baitapthem;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Student extends Human {
    private static int IDC = 0;
    private int id;
    private double avgPoint;
    private String xepLoai;

    public Student(String name, int age, String gender, String address, double avgPoint) {
        super(name, age, gender, address);
        id = ++IDC;
        this.avgPoint = avgPoint;
    }
    public Student(String name,double avgPoint) {
        super(name);
        id = ++IDC;
        this.avgPoint = avgPoint;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }
    public void xepLoai(){
        if(avgPoint >= 8.5){
            xepLoai = "Great";
        }else if(avgPoint >= 6.5){
            xepLoai = "Good";
        }else if( avgPoint >= 4.5){
            xepLoai = "Normal";
        }else {
            xepLoai = "Bad";
        }
    }
    public void displayByXepLoai(){
        System.out.printf("%-15S", getName());
        System.out.printf("%-15f", getAvgPoint());
        System.out.printf("%-15S\n", getXepLoai());

    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "id=" + id +
                ", avgPoint=" + avgPoint +
                ", xepLoai='" + xepLoai + '\'' +
                '}';
    }
    public String displayInformation(){
        return (String.format("%-15d%-20S%-15S%-15d%-15.2f\n", getId(), super.getName(),getGender(), getAge(),getAvgPoint()));
    }

}
