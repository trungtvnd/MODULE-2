package BUOI43.baitap.baitapthemreview;

public class Student extends Human{
    private static int IDC = 0;
    private int id;
    private double avgPoint;

    public Student(int id, double avgPoint) {
        this.id = id;
        this.avgPoint = avgPoint;
    }

    public Student(String name, int age, String gender, String address,double avgPoint) {
        super(name, age, gender, address);
        this.id = ++IDC;
        this.avgPoint = avgPoint;
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

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "id=" + id +
                ", avgPoint=" + avgPoint +
                '}';
    }
}
