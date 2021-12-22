package BUOI36.baitap.baiTapThemReview;

public class Cat extends Animal implements AnimalAction {
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 10;
    }

    @Override
    public String makeSound() {
        return "Meo Meo";
    }

    public void catchMouse(){
        System.out.println("Mèo biết bắt chuột");
    }
    public void display() {
        System.out.printf("%-20s", "Cat");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
