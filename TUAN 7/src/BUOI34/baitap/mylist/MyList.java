package BUOI34.baitap.mylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object []elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(int index, E e){
        index = size;
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i){
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public void remove(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }else {
            for (int i = index; i < size; i++) {
                elements[i]  = elements[i + 1];
            }
            size -= 1;
        }

    }
    public int size(){
        return size;
    }
    public void clear(){
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }
    public int indexOf(E e){
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public boolean contain(E e){
        for (int i = 0; i < size; i++) {
            if(e.equals(elements[i])){
                return true;
        }
        }return false;
    }
}

