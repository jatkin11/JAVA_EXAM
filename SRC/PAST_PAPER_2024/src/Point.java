public class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return this.x; }
    public int getY() { return this.y; }
    @Override
    public int hashCode() { return java.util.Objects.hash(x, y); }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (!(obj instanceof Point)) { return false; }
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}