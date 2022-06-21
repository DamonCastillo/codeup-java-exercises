package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double width;
    protected double length;

    public Quadrilateral(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Quadrilateral() {

    }
}
