package BUOI38.thuchanh.sapXepNoiBot;

public class SapXepNoiBot {
    static int [] list = {2, 3, 2, 5, 6, 1, -2, 14, 12};
    public static void sortBuble(int [] list){
        for (int i = 1; i < list.length;i++) {
            for (int j = 0; j < list.length - i; j++) {
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list1 = {5, 4, 2, 3};
        sortBuble(list1);
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i]);
        }
    }
}
