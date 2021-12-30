package BUOI43.baitap.baitapthemreview;

public class Human {
    private String name;
    private int age;
    private String gender;
    private String Address;

    public Human() {
    }

    public Human(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        Address = address;
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
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
