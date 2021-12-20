package BUOI36.baitap.baiTapThem;

public class Mouse extends Animals implements ActionAnimal {
    private String type;

    public String getType() {
        return type;
    }

    public Mouse(String type) {
        this.type = type;
    }

    public Mouse(String name, int age, double weight, String type) {
        super(name, age, weight);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    int catchedByCat() {
        return this.run() + 5;
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return null;
    }

    @Override
    public String toString() {
        return "Mouse{" + super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
