package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4,5);

        double area1 = box1.getArea();
        double perimeter1 = box1.getPerimeter();
        System.out.println("Perimeter of box 1 is: " + perimeter1);
        System.out.println("Area of box 1 is: " + area1);


        Rectangle box2 = new Square(5);

        double area2 = box2.getArea();
        double perimeter2 = box2.getPerimeter();

        System.out.println("Perimeter of box2 is: " + perimeter2);
        System.out.println("Area of box2 is: " + area2);

    }
}
