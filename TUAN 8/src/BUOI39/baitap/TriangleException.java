package BUOI39.baitap;

public class TriangleException extends Throwable {
    public TriangleException(){
        super("IllegalTriangleException");
    }

    public TriangleException(String s) {
        super(s);
    }
}
