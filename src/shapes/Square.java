package shapes;

public class Square extends Quadrilateral {
    protected double side;

    public void setSide(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    public double getSide() {
        return side;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public void setLength(double side){
        setSide(side);
    }
    public void setWidth(double side){
        setSide(side);
    }

    public double getPerimeter(){
        return 4 * side;
    }
    public double getArea(){
        return side * side;
    }
}
