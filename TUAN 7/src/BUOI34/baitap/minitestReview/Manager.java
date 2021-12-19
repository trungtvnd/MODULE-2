package BUOI34.baitap.minitestReview;

import java.util.Scanner;

public interface Manager {
    void display();
    void addPerson(Human human);
    void searchPerson(Scanner sc);
    void deletePerson(Scanner sc);
    void updatePerson(Scanner sc);
    void sortPerson();
    void Total();

}
