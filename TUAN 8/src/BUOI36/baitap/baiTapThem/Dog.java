package BUOI36.baitap.baiTapThem;

public class Dog extends Animals implements ActionAnimal {
    private String type;

    public Dog() {
    }

    public Dog(String type) {
        this.type = type;
    }

    public Dog(String name, int age, double weight, String type) {
        super(name, age, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int hunTing(){
        return run()+10;
    }

    public String watchHome(){
        return "Gru gừ gừ";
    }
    @Override
    public int run() {
        return 10;
    }

    @Override
    public String makeSound() {
        return "Gâu gâu";
    }

    @Override
    public String toString() {
        return "Dog{" +super.toString()+
                "type='" + type + '\'' +
                '}';
    }

//    public void displayInformation(){
//
//       System.out.printf("name: %s, Tuoi: %d, Cân Nặng: %f, Loại chó: %s Sủa: %s, Chạy: %d, Trông nhà: %s, Săn mồi: %d ",getName(), getAge(), getWeight(), getType(), makeSound(),run(), watchHome(),hunTing());
//    }

}
