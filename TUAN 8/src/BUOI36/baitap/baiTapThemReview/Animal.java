package BUOI36.baitap.baiTapThemReview;

public class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal() {
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void displayContent(){
        System.out.println("=========MENU==========");
        System.out.printf("%-20S %-20S %-20S %-20S", "Type", "Name", "Age", "Weight");
    }

    public void display() {
        System.out.printf("%-20s", "Animal");
        System.out.printf("%-20S", name);
        System.out.printf("%-20s", age);
        System.out.printf("%s", weight);
        System.out.println();
    }
}
