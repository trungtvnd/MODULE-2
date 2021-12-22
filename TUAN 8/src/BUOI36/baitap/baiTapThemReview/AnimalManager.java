package BUOI36.baitap.baiTapThemReview;

import java.util.HashSet;
import java.util.Scanner;

public class AnimalManager {

    private HashSet<Animal> animalHashSet ;

    public AnimalManager() {
        this.animalHashSet = new HashSet<>();
    }

    public AnimalManager(HashSet<Animal> animalHashSet) {
        this.animalHashSet = animalHashSet;
    }

    public void addAnimal(Animal animal) {
        animalHashSet.add(animal);
    }

    public void displayAll() {
        System.out.println("=========MENU==========");
        System.out.printf("%-20S%-20S%-20S%-20S\n", "Type", "Name", "Age", "Weight");
        for (Animal animal : animalHashSet) {
            animal.display();
        }
    }
    public void displayByName(Scanner sc){
        String name = sc.nextLine();
        for (Animal animal:animalHashSet) {
            if(name.equals(animal.getName())){
                animal.display();
            }
        }
    }

    public boolean checkName(String name) {
        for (Animal animal : animalHashSet) {
            if (name.equals(animal.getName())) {
                return true;
            }
        }
        return false;
    }

    public void createAnimal(Scanner sc) {
        sc.nextLine();
        String name;
        while (true) {
            System.out.println("Nhập tên");
            name = sc.nextLine();
            if (checkName(name)) {
                System.out.println("Tên đã tồn tại , bạn vui lòng nhâp lại");
            } else {
                break;
            }
        }
        System.out.println("Nhập tuổi:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập cân nặng");
        double weight = sc.nextDouble();
        System.out.println("Nhập lựa chọn");
        System.out.println("1. Animal");
        System.out.println("2. Dog");
        System.out.println("3. Cat");
        System.out.println("4. Mouse");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                Animal animal = new Animal(name, age, weight);
                animalHashSet.add(animal);
                break;
            case 2:
                Animal animal1 = new Dog(name, age, weight);
                animalHashSet.add(animal1);
                break;
            case 3:
                Animal animal2 = new Cat(name, age, weight);
                animalHashSet.add(animal2);
                break;
            case 4:
                Animal animal3 = new Mouse(name, age, weight);
                animalHashSet.add(animal3);
                break;
        }
    }

    public void deleteAnimal(Scanner sc){
        String name = sc.nextLine();
        animalHashSet.removeIf(animal -> name.equals(animal.getName()));
    }
    public void editAnimal(Scanner sc){
        sc.nextLine();
        Animal animalEdit = null;
        System.out.println("Nhập tên");
        String  name = sc.nextLine();
        for (Animal animal:animalHashSet) {
            if(name.equals(animal.getName())){
                animalEdit = animal;
                while (true) {
                    System.out.print("Nhập tên mới");
                    name = sc.nextLine();
                    if (checkName(name)) {
                        System.out.println("Tên đã tồn tại , bạn vui lòng nhâp lại");
                    } else {
                        animalEdit.setName(name);
                        break;
                    }
                }
                System.out.println("Nhập Tuổi sửa");
                animalEdit.setAge(sc.nextInt());
                System.out.println("Nhập Cân nặng sửa");
                animalEdit.setWeight(sc.nextDouble());
            }else {
                break;
            }

        }

    }

    public void displayDog(){
        for (Animal animal:animalHashSet) {
            if(animal instanceof Dog){
                animal.display();
            }
        }
    }

    public void displayByWeight(Scanner sc){
        System.out.println("Input BeginPrice");
        double beginPrice = sc.nextDouble();
        System.out.println("Input EndPrice");
        double endPrice = sc.nextDouble();
        double temp;
        if(beginPrice > endPrice){
            temp = beginPrice;
            beginPrice = endPrice;
            endPrice = temp;
        }  for (Animal animal:animalHashSet) {
            if(animal.getWeight() >= beginPrice && animal.getWeight()<= endPrice){
                animal.display();
            }
        }
    }
}

