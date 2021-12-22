package BUOI36.baitap.baiTapThemReview;

public class Dog extends Animal implements AnimalAction {
    public Dog() {
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 10;
    }

    @Override
    public String makeSound() {
        return "Gâu gâu";
    }

    public void watchHome(){
        System.out.println("Chó trông nhà");
    }


    public void display() {
        System.out.printf("%-20s", "Dog");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
