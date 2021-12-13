package BUOI31.baitap.interfaceResizeable;

public class Rectangle extends Shape {
    private double width = 1;
    private  double height = 1;
    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public  double getPerimeter(){
        return  (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width *= (percent /200);
        this.height *= (percent /200);
    }
}
