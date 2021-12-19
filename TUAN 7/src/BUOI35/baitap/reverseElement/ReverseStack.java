package BUOI35.baitap.reverseElement;



import java.util.*;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <String> stackList = new Stack<>();
        System.out.println("Nhập vào một chuỗi");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackList.push(s.charAt(i)+"");
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackList.pop());
        }


        Stack <Integer> integerStackList = new Stack<>();
        int[] intList = new int[5];
        for (int i = 0; i < intList.length; i++) {
            System.out.println("Nhập phần tủ thứ" + (i+1));
            intList[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(intList));
        for (int j : intList) {
            integerStackList.push(j);
        }
        for (int i = 0; i < intList.length; i++) {
            System.out.print(integerStackList.pop()+",");
        }
    }

}
