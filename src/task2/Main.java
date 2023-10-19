package task2;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<FlatFigure> flatFigures = new ArrayList<>();
        flatFigures.add(new Triangle(3, 4));
        flatFigures.add(new Square(5));
        flatFigures.add(new Rectangle(6, 8));
        flatFigures.add(new Circle(4));

        for (FlatFigure ffigure : flatFigures) {
            System.out.println(ffigure.area());
        }

        List<VolumeFigure> volumeFigures = new ArrayList<>();
        volumeFigures.add(new Sphere(5));
        volumeFigures.add(new Pyramid(30, 5));
        volumeFigures.add(new Cube(5));

        for (VolumeFigure vfigure : volumeFigures) {
            System.out.println(vfigure.volume());
        }
    }
}
