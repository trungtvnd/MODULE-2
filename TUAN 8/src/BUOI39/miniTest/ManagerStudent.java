package BUOI39.miniTest;

import java.util.*;
import java.util.stream.Collectors;

public class ManagerStudent {
    private HashSet<Person> personHashSet = new HashSet<>();
    private Student students = new Student();


    public ManagerStudent() {
    }

    public ManagerStudent(HashSet<Person> personHashSet) {
        this.personHashSet = personHashSet;
    }

    public void addStudent(Student student) {
        personHashSet.add(student);
    }

    public void createStudent(Scanner sc) {
        System.out.println("Input information: ");
        System.out.println("Input Name");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Input Age");
        int age = sc.nextInt();
        System.out.println("Input Math Point");
        double mathPoint = sc.nextDouble();
        System.out.println("Input Physical Point");
        double physicalPoint = sc.nextDouble();
        System.out.println("Input Chemical Point");
        double chemicalPoint = sc.nextDouble();
        Person student = new Student(name, age, mathPoint, physicalPoint, chemicalPoint);
        personHashSet.add(student);
    }

    public void displayStudent() {
        for (Person person : personHashSet) {
            System.out.println(person);
        }
    }

    public void deleteStudent(Scanner sc) {
        System.out.println("Input id you want to delete");
        int id = sc.nextInt();
        personHashSet.removeIf(stu -> id == stu.getId());
    }

    public void editStudent(Scanner sc) {
        System.out.println("Input id you want to update");
        int id = sc.nextInt();
        sc.nextLine();
        Student studentEdit = null;
        for (Person stu : personHashSet) {
            if (id == stu.getId() && stu instanceof Student) {
                studentEdit = (Student) stu;
                System.out.println("Input information you want to change");

                System.out.println("Input name");
                studentEdit.setName(sc.nextLine());
                sc.nextLine();
                System.out.println("Input age edit");
                studentEdit.setAge(sc.nextInt());

                System.out.println("Input MathPoint");
                studentEdit.setMathPoint(sc.nextDouble());

                System.out.println("Input PhysicalPoint");
                studentEdit.setPhysicalPoint(sc.nextDouble());

                System.out.println("Input Chemical point");
                studentEdit.setChemicalPoint(sc.nextDouble());

            }
        }
    }

    public void searchStudent(Scanner sc) {
        System.out.println("Input id you want to update");
        int id = sc.nextInt();
        for (Person stu : personHashSet) {
            if (id == stu.getId()) {
                System.out.println(stu);
            }
        }
    }

    public void dispalyStudentByPoint() {
        double max = 0;
        for (Person student : personHashSet) {
            if (student instanceof Student) {
                if (((Student) student).avgPoint() > max) {
                    max = ((Student) student).avgPoint();
                    System.out.println(student);
                }
            }
        }

    }


//    public void sortByAvgPoint() {
//        HashSet<Person> person1 = new HashSet<>();
//        HashSet<Student> students = new HashSet<>();
//        for (Person person : personHashSet) {
//            if (person instanceof Student) {
//                students.add((Student) person);
//            }
//        }
//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.avgPoint() > o2.avgPoint()) {
//                    return 1;
//                } else if (o1.avgPoint() < o2.avgPoint()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//    person1.addAll(students);
//    personHashSet = person1;
//
//    }


}

