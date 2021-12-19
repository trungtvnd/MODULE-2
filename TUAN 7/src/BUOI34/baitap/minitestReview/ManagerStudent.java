package BUOI34.baitap.minitestReview;

import java.util.*;

public class ManagerStudent implements Manager {
    private ArrayList<Human> humans;

    public ManagerStudent(ArrayList<Human> humans) {
        this.humans = humans;
    }

    public ManagerStudent() {
        this.humans = new ArrayList<>();

    }

    @Override
    public void display() {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    @Override
    public void addPerson(Human human) {
        humans.add(human);
    }

    @Override
    public void searchPerson(Scanner sc) {
        System.out.println("Nhập id muốn xóa");
        int id = sc.nextInt();
        for (Human human : humans) {
            if (id == human.getId()) {
                System.out.println(human);
            }
        }
    }

    @Override
    public void deletePerson(Scanner sc) {
        System.out.println("Input id");
        int id = sc.nextInt();
        humans.removeIf(h -> id == h.getId());
    }

    @Override
    public void updatePerson(Scanner sc) {
        System.out.println("Input id you want to edit");
        int id = sc.nextInt();
        Human humanEdit = null;
        Student studentEdit = null;
        for (Human human:humans) {
            if(id == human.getId()&& human instanceof Student){
                studentEdit = (Student) human;
                System.out.println("Nhập tên mới");
                studentEdit.setName(sc.nextLine());
                sc.nextLine();
                System.out.println("Nhập tuổi mới ");
                studentEdit.setAge(sc.nextInt());
                System.out.println("Nhập điểm ");
                studentEdit.setAvgPoint(sc.nextDouble());

            }else if(id == human.getId()){
                humanEdit = human;
                System.out.println("Nhập tên mới");
                humanEdit.setName(sc.nextLine());
                System.out.println("Nhập tuổi");
                humanEdit.setAge(sc.nextInt());
            }
        }

    }

    @Override
    public void sortPerson() {
        ArrayList<Human> humans1 = new ArrayList<>();
        ArrayList<Student> students1 = new ArrayList<>();
        for (Human human:humans) {
            if(human instanceof Student){
                students1.add((Student) human);
            }
            else {
                humans1.add(human);
            }
        }
      Collections.sort(students1, new Comparator<Student>() {
          @Override
          public int compare(Student o1, Student o2) {
              if(o1.getAvgPoint() > o2.getAvgPoint()){
                  return 1;
              }else if(o1.getAvgPoint() < o2. getAvgPoint()){
                  return -1;
              }else {
                  return 0;
              }
          }
      });
        humans1.addAll(students1);
        humans = humans1;

    }

    @Override
    public void Total() {
        double total = 0;
        for (Human h:humans) {
            if(h instanceof Student){
                total += ((Student) h).getAvgPoint();
                System.out.println(total);
            }

        }

    }

    public void creatHuman(Scanner sc, ManagerStudent managerStudent) {
        sc.nextLine();
        System.out.print("Nhập thông tin tên ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = sc.nextInt();
            System.out.println("1. add human");
            System.out.println("2. add Student");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = sc.nextInt();
            if (choice == 1) {
                Human human =  new Human(name, age);
                managerStudent.addPerson(human);
            } else if (choice == 2) {
                System.out.println("Nhập điểm trung bình");
                double avgPoint = sc.nextDouble();
              Human human = new Student(name, age, avgPoint);
              managerStudent.addPerson(human);
            }
    }

}
