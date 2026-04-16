import java.util.Comparator;

public class Walker implements Voyager<Person>{

    private final Object[] array;
    private final char c;
    private int currentIndex = 0;
    private final int arraySize;

    public Walker(Object[] array, char c){
        if(array == null){
        throw new IllegalArgumentException();
    }
        this.array = array;
        this.c = c;
        this.arraySize = array.length;
    }

    @Override
    public boolean anotherVisitPossible(){
        return currentIndex < arraySize;
    }

    @Override
    public Person makeAVisit(){
        while(currentIndex < arraySize){
            if(array[currentIndex] instanceof Person p){
                if(p.getName().contains(Character.toString(c))){
                    currentIndex++;
                    return p;
                }
                currentIndex++;
            }
            else{
                if(array[currentIndex] == null){
                    currentIndex++;
                    return null;
                }
                currentIndex++;
            }
        }
        return null;
    }
}
