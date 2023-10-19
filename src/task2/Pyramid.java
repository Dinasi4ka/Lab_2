package task2;

public class Pyramid extends VolumeFigure{
    private final double areaBase;
    private final double height;

    public Pyramid(double areaBase, double height) {
        this.areaBase = areaBase;
        this.height = height;
    }

    @Override
    public double volume() {
        return 1./3 * areaBase * height;
    }
}
