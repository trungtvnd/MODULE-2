package BUOI36.baitap.baiTapThemReview;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();

        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("----------------");
            System.out.println("==========MENU==========");
            System.out.println("" +
                    "1. Add Animal\n" +
                    "2. Delete by name\n" +
                    "3. Edit by name\n" +
                    "4.Display one animal by name\n" +
                    "5. Display All Animals\n" +
                    "6. Display dog\n" +
                    "7. Display animal by arange weight\n" +
                    "0. Exit\n" +
                    "\n");
            System.out.println("Input your choice");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    animalManager.createAnimal(sc);
                    break;
                case 2:
                    animalManager.deleteAnimal(sc);
                    break;
                case 3:
                    animalManager.editAnimal(sc);
                    break;
                case 4:
                    animalManager.displayByName(sc);
                    break;
                case 5:
                    animalManager.displayAll();
                    break;
                case 6:
                    animalManager.displayDog();
                    break;
                case 7:
                    animalManager.displayByWeight(sc);
                    break;
            }
        }while (choice!= 0);
    }
}
