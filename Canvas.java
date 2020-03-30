import Point.java;
import java.util.List;

public class Canvas {
    List<Point> points = new ArrayList<Point>();
    int b;

    //constructor
    public Canvas(List<Point> points) {
        this.points = points;
    }

    public boolean addPoint(Point p) {
        return points.add(p);
    }

    public boolean removePoint(Point p) {
        return points.remove(p)
    }
}