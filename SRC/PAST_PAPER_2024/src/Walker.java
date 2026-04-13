public class Walker implements Voyager<Person>{

    private final Object[] arrayToWalk;
    private final char c;
    private int visitedCount = 0;

    public Walker(Object[] array, char c)
    {
        if(array == null){
            throw new IllegalArgumentException();
        }
        this.arrayToWalk = array;
        this.c = c;
    }

    @Override
    public Person makeAVisit() {
        for (int i = visitedCount; i < arrayToWalk.length; i++) {
            if (arrayToWalk[i] instanceof Person p && p.getName().contains(Character.toString(c))) {
                visitedCount++;
                return p;
            }
            if (arrayToWalk[i] == null) {
                visitedCount++;
                return null;
            } else {
                visitedCount++;
            }
        }
        return null;
    }

    @Override
    public boolean anotherVisitPossible() {
        return this.visitedCount < arrayToWalk.length;
    }
}
