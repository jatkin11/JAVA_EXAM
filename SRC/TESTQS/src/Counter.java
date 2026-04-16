public class Counter {
    private int count;

    public void click() { count++; }
    public void reset() { count = 0; }
    public int getCount() { return count; }

    @Override
    public String toString() {
        return "count = " + count;
    }
}