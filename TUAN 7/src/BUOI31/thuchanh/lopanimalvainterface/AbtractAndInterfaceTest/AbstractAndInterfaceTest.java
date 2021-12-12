package BUOI31.thuchanh.lopanimalvainterface.AbtractAndInterfaceTest;


import BUOI31.thuchanh.lopanimalvainterface.Animal.Animal;
import BUOI31.thuchanh.lopanimalvainterface.Animal.Chicken;
import BUOI31.thuchanh.lopanimalvainterface.Animal.Tiger;
import BUOI31.thuchanh.lopanimalvainterface.Edible.Edible;
import BUOI31.thuchanh.lopanimalvainterface.Fruit.Apple;
import BUOI31.thuchanh.lopanimalvainterface.Fruit.Fruit;
import BUOI31.thuchanh.lopanimalvainterface.Fruit.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());

            }

        }
        Fruit []fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit:fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
