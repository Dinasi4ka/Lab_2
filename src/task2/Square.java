package task2;

public class Square extends FlatFigure {
    private final double side1;
    public Square(double side1) {
        this.side1 = side1;
    }

    @Override
    public double area() {
        return Math.pow(side1,2);
    }
}




