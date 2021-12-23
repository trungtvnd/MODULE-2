package BUOI39.miniTest;

import java.util.Comparator;

public class Student extends Person implements Comparator<Student> {
    private static double avgPoint;
    private double mathPoint;
    private double physicalPoint;
    private double chemicalPoint;

    public Student() {
    }


    public Student(double mathPoint, double physicalPoint, double chemicalPoint) {
        this.mathPoint = mathPoint;
        this.physicalPoint = physicalPoint;
        this.chemicalPoint = chemicalPoint;
    }
    public double avgPoint(){
        return avgPoint = (mathPoint + physicalPoint + chemicalPoint)/3;
    }

    public Student(String name, int age, double mathPoint, double physicalPoint, double chemicalPoint) {
        super(name, age);
        this.mathPoint = mathPoint;
        this.physicalPoint = physicalPoint;
        this.chemicalPoint = chemicalPoint;
        avgPoint =( mathPoint + physicalPoint + chemicalPoint)/3;


    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getPhysicalPoint() {
        return physicalPoint;
    }

    public void setPhysicalPoint(double physicalPoint) {
        this.physicalPoint = physicalPoint;
    }

    public double getChemicalPoint() {
        return chemicalPoint;
    }

    public void setChemicalPoint(double chemicalPoint) {
        this.chemicalPoint = chemicalPoint;
    }


    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "mathPoint=" + mathPoint +
                ", physicalPoint=" + physicalPoint +
                ", chemicalPoint=" + chemicalPoint +
                '}';
    }



    @Override
    public int compare(Student o1, Student o2) {
        if(o1.avgPoint()> o2.avgPoint()){{
            return 1;

        }}else if(o1.avgPoint()<o2.avgPoint()){
            return -1;
        }else {
            return 0;
        }
    }
}
