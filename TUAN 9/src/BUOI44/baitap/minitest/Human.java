package BUOI44.baitap.minitest;

public class Human {
    public static int IDC = 0;
    private int id;
    private String name;
    private int age;

    public Human() {
    }

    public Human( String name, int age) {
        this.id = ++IDC;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
