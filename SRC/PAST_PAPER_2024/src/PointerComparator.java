import java.util.Comparator;

public class PointerComparator implements Comparator<Point> {


    public int compare(Point p1, Point p2) {

        if (p1.getX() >= p2.getX()) {
            if (p1.getY() >= p2.getY()) {
                return 1;
            }
        } else {
            if (p1.getY() >= p2.getY()) {
                return -1;
            }
        }
        return p1.equals(p2) ? 0 : 1;
    }
}
