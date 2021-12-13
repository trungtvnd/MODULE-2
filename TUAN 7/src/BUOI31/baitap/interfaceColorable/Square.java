package BUOI31.baitap.interfaceColorable;

public class Square extends Shape implements Colorable{
    private double side = 0;
    public Square(){

    }
    public Square(double side){
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + super.toString()+
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Tô bốn cạnh");
    }
}
