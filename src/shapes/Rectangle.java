package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

private double length;
private double width;


    public void setLength(double length) {
        this.length = length;
    }


    public void setWidth(double width) {
        this.width = width;
    }
    public Rectangle(double length, double width) {
        super(length, width);
        this.length = length;
        this.width= width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }


}
