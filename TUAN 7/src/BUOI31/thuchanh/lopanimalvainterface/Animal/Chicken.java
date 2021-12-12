package BUOI31.thuchanh.lopanimalvainterface.Animal;

import BUOI31.thuchanh.lopanimalvainterface.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }
    public String howToEat(){
        return "Could be Fried";
    }
}
