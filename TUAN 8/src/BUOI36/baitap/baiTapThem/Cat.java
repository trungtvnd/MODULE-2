package BUOI36.baitap.baiTapThem;

public class Cat extends Animals implements ActionAnimal {
    private String type;

    public Cat(String type) {
        this.type = type;
    }

    public Cat(String name, int age, double weight, String type) {
        super(name, age, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    int catchMouse() {
        return this.run() + 10;
    }

    @Override
    public int run() {
        return 8;
    }

    @Override
    public String makeSound() {
        return "meo meo";
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
