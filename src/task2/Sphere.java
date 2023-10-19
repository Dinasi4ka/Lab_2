package task2;

public class Sphere extends VolumeFigure{
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4./3 * Math.PI * Math.pow(radius,3);
    }
}
