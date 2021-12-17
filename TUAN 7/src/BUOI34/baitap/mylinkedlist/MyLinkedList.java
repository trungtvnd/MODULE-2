package BUOI34.baitap.mylinkedlist;

import org.w3c.dom.Node;

public class MyLinkedList {
    private Node head;
    private int numNodes;
    MyLinkedList(Object data){
        head = new Node(data);
    }

    public class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data = data;
        }
        public Object getData(Object data){
            return this.data;
        }
    }

    public void add(int index, Object data){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index -1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
//    public Node removeFirst(Object data){
//        if(numNodes == 0){
//            return null;
//        }
//    }

}
