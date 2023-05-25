package shapes;

public class Rectangle {


    public final double length;
    public final double  width;


    //constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    //calculate Area method
    public double getArea(){
        System.out.println("Area from Rectangle Class is: " + length * width);
        return length * width;
    }

    //calculate Perimeter method
    public  double getPerimeter(){
        System.out.println("Perimeter from Rectangle class is: " + 2 * (width * width));
        return 2 * (length + width);
    }



}
