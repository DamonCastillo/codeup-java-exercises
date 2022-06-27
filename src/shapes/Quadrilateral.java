package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double width;
    protected double length;

    public Quadrilateral(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public abstract double SetWidthAndLength(double width,double length);

    public Quadrilateral() {

    }
}
