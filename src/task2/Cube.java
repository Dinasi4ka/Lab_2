package task2;

public class Cube extends VolumeFigure{
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return Math.pow(side,3);
    }
}
