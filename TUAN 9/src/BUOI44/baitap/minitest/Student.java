package BUOI44.baitap.minitest;

public class Student extends Human {
    private double mathPoint;
    private double physicalPoint;
    private double chemicalPoint;

    public Student(double mathPoint, double physicalPoint, double chemicalPoint) {
        this.mathPoint = mathPoint;
        this.physicalPoint = physicalPoint;
        this.chemicalPoint = chemicalPoint;
    }

    public Student(String name, int age, double mathPoint, double physicalPoint, double chemicalPoint) {
        super(name, age);
        this.mathPoint = mathPoint;
        this.physicalPoint = physicalPoint;
        this.chemicalPoint = chemicalPoint;
    }
    public double getAvgPoint(){
        return (mathPoint + physicalPoint+chemicalPoint)/3;
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
        return "Student{" + super.toString()+
                "mathPoint=" + mathPoint +
                ", physicalPoint=" + physicalPoint +
                ", chemicalPoint=" + chemicalPoint +
                ", avgPoint=" + getAvgPoint() +
                '}';
    }
}
