package shapes;

public class ShapesTest {
        public ShapesTest(double length, double width) {
                super();
        }


        public static void main(String[] args) {
                Measurable myShape;

                myShape = new Rectangle(5, 4);
                System.out.println("Rectangle Area: " + myShape.getArea());
                System.out.println("Rectangle Perimeter: " + myShape.getPerimeter());

                myShape = new Square(4) {
                        @Override
                        public void setLength(double length) {
                                this.sideLength = length;
                        }

                        @Override
                        public void setWidth(double width) {
                                this.sideLength = width;
                        }

                };
                System.out.println("Square Area: " + myShape.getArea());
                System.out.println("Square Perimeter: " + myShape.getPerimeter());

        }
}





