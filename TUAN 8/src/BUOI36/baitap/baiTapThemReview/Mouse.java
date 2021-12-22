package BUOI36.baitap.baiTapThemReview;

public class Mouse extends Animal implements AnimalAction {

    public Mouse() {
    }

    public Mouse(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return null;
    }
    public void anVung(){
        System.out.println("Chuột ăn vụng");
    }
    public void display() {
        System.out.printf("%-20s", "Mouse");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
