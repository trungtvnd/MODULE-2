package BUOI31.baitap.interfaceResizeable;

public class Square extends Shape{
    private  double side;

    public Square(){

    }

    public Square(double side){
        this.side = side;
    }
    public  Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side * side;
    }

    @Override
    public void resize(double percent) {
        this.side *= (percent / 200);
    }
}
