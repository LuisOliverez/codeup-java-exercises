package shapes;
import util.Input;
public class CircleApp {

    public static void main(String[] args) {
        Input in = new Input();
      do {
        System.out.println("Please enter a circles radius to solve for its area and circumference.");
        double radius = in.getDouble();
        Circle cir = new Circle(radius);

        System.out.println("this is the area: " +cir.getArea());
        System.out.println("this is the circumference: " +cir.getCircumference());
        System.out.println("Would you like to continue to use the CircleApp?");
        in.getString();
      }while (in.yesNo());


    }

}
