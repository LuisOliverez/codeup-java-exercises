package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;



    //constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //getters for Length
    public double getLength() {
        return this.length;
    }
    //getters for Width
    public double getWidth() {
        return this.width;
    }


    //abstract setters for Length(abstract setter cant have body)
    public abstract void setLength(double length);

    //abstract setters for (abstract setter cant have body)
    public abstract void setWidth(double width);
}
