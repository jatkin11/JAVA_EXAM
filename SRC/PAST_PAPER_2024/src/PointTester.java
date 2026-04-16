public class PointTester {

    static void main() {
        java.util.Set<Point> points = new java.util.TreeSet<>(new PointerComparator());
        points.addAll( java.util.List.of(
                new Point(1,2), new Point(2,1), new Point(-1,2), new Point(2, -1),
                new Point(0,3), new Point(3,0), new Point(0,0), new Point(0,1),
                new Point(30000,0), new Point(0,30000) ) );
                 System.out.println(points);
    }



}
