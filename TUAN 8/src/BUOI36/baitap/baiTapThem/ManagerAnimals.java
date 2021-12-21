package BUOI36.baitap.baiTapThem;

import java.util.*;

public class ManagerAnimals {
    private HashSet<Animals> animalsSet;

    public ManagerAnimals() {
        this.animalsSet = new HashSet<>();
    }

    public ManagerAnimals(HashSet<Animals> animalsSet) {
        this.animalsSet = animalsSet;
    }

    public void display(){
        for (Animals animals:animalsSet) {
            System.out.println(animals);
        }
    }

    public void addAnimals(Animals animals) {
        animalsSet.add(animals);
    }

    public void creatAnimals(Scanner sc, ManagerAnimals managerAnimals){
        sc.nextLine();
        System.out.println("Nhập thông tin");
        System.out.println("Nhập Tên");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = sc.nextInt();
        System.out.println("Nhập cân nặng");
        double weight = sc.nextDouble();
        System.out.println("các loài");
        System.out.println("1. Dog\n" +
                "2. Cat\n" +
                "3. Mouse\n");
        System.out.println("Nhập lựa chọn");
        int choice = sc.nextInt();
        sc.nextLine();
        if(choice == 1){
            System.out.println("Nhập loài");
            String type = sc.nextLine();
            Animals dog = new Dog(name, age, weight, type);
            managerAnimals.addAnimals(dog);
        }else if(choice ==2){
            System.out.println("Nhập loài");
            String type = sc.nextLine();
            Animals cat = new Cat(name, age, weight, type);
            managerAnimals.addAnimals(cat);
        }else if(choice == 3){
            System.out.println("Nhập loài");
            String type = sc.nextLine();
            Animals mouse = new Mouse(name, age, weight, type);
            managerAnimals.addAnimals(mouse);
        }

    }
    public void deleteAnimal(Scanner sc){
        sc.nextLine();
        System.out.println("Nhập tên muốn xóa");
        String name = sc.nextLine();
        animalsSet.removeIf(animals -> name.equals(animals.getName()));
    }

    public void editAnimal(Scanner sc){
        sc.nextLine();
        System.out.println("Nhập tên muốn sửa");
        String name = sc.nextLine();
        Animals dogEdit;
        Animals catEdit = null;
        Animals mouseEdit = null;
        for (Animals animal:animalsSet) {
            if (name.equals(animal.getName())){
                if(animal instanceof Dog){
                    dogEdit = animal;
                    System.out.println("Nhập tên mới");
                    dogEdit.setName(sc.nextLine());
                    sc.nextLine();
                    System.out.println("Nhập tuổi");
                    dogEdit.setAge(sc.nextInt());
                    System.out.println("Nhập cân nặng: ");
                    dogEdit.setWeight(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Nhập loại");

                }else if(animal instanceof  Cat){
                    System.out.println("Nhập tên mèo mới ");
                    animal.setName(sc.nextLine());
                    sc.nextLine();
                    System.out.println("Nhập tuổi meo");
                    animal.setAge(sc.nextInt());
                    System.out.println("Nhập cân nặng: ");
                    animal.setWeight(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Nhập loại");
                    ((Cat) animal).setType(sc.nextLine());
                }else if(animal instanceof Mouse){
                    System.out.println("Nhập tên chuột mới ");
                    animal.setName(sc.nextLine());
                    sc.nextLine();
                    System.out.println("Nhập tuổi chuột ");
                    animal.setAge(sc.nextInt());
                    System.out.println("Nhập cân nặng: ");
                    animal.setWeight(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Nhập loại");
                    ((Mouse) animal).setType(sc.nextLine());
                }
            }
        }
    }
    public void displayMotCon(Scanner scanner){
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        for (Animals animals:animalsSet) {
            if(name.equals(animals.getName())){
                System.out.println(animals);
            }
        }
    }
    public void displayWeight(Scanner sc){
        System.out.println("Nhập khoảng cân nặng");
        System.out.println("Nhập cân nặng bắt đầu ");
        double startWeight = sc.nextDouble();
        System.out.println("Nhập cân nặng bắt đầu ");
        double endWeight = sc.nextDouble();
        double temp;
        if(startWeight > endWeight){
            temp = startWeight;
            startWeight = endWeight;
            endWeight = temp;
        }
        for (Animals animals:animalsSet) {
            if(animals.getWeight() >= startWeight && animals.getWeight() <= endWeight){
                System.out.println(animals);
            }

        }

    }

}
