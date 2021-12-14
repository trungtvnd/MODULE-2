package BUOI32.baitap.baitapvenha;
import java.util.Comparator;
public class Student implements Comparable<Student>{
    private static int id = 0;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double averagePoint;

    public Student(String name, int age, String gender, String address, double averagePoint) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.averagePoint = averagePoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", averagePoint=" + averagePoint +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(getAveragePoint() > o.getAveragePoint()){
            return 1;
        }else if(getAveragePoint() < o.getAveragePoint()){
            return -1;
        }else {
            return 0;
        }
    }
}
