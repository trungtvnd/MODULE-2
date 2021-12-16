package BUOI34.baitap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(0,1);
        listInteger.add(1,2);
        listInteger.add(2,3);
        System.out.println(listInteger.get(0));
        System.out.println(listInteger.get(1));
        System.out.println(listInteger.get(2));
//        System.out.println(listInteger.get(3));
    }

}
