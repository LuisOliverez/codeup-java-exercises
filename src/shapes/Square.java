package shapes;

    abstract class Square extends Quadrilateral {
        protected double sideLength;


        public Square(double sideLength) {
            super(sideLength, sideLength);
            this.sideLength = sideLength;
        }


        @Override
        public double getPerimeter() {
            return 4 * sideLength;
        }

        @Override
        public double getArea() {
            return sideLength * sideLength;
        }

    }