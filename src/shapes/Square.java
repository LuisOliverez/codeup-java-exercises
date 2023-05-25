package shapes;

    public class Square extends Rectangle {
        private double side;


        //constructor
        public Square (double side) {
            super(side, side);
            this.side = side;

    }



        @Override
        public double getArea() {
            System.out.println("Area from Square Class");
            return side*side;
        }

        @Override
        public double getPerimeter() {
            System.out.println("Perimeter from Square Class");
            return 4*side;
        }
    }