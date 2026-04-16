import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class NamedCounter extends Counter{
    private String name;

    public NamedCounter(String name){
        super();
        this.name = name;
    }

    @Override
    public String toString(){
        return name +": count = " + super.getCount();
    }


    public static boolean allPositive(List<Integer> list){
        for(Integer i : list){
            if (i<=0){
                return false;
            }
        }
        return true;
    }


    public static boolean nonDecreasing(List<Integer> list){

        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;

    }


    public static int countNulls(Object[] array){
        int nullCount = 0;
        for(Object o: array){
            if (o == null){
                nullCount++;
            }
        }
        return nullCount;
    }


    public static List<String> longStrings(String[] array){
        return Arrays.stream(array)
                .filter(Objects::nonNull)
                .filter(r -> r.length() >= 4).toList();
    }

    public static int sumTo(int n){

        if(n <= 0){
            return 0;
        }

        return n + sumTo(n-1);
    }

    public static int countA(String s){

        if(s.isEmpty()){return 0;}

        int count = 0;

        if(s.charAt(0) == 'a'){
            count++;
        }

        count += countA(s.substring(1));

        return count;
    }


    public static String repeat(String s, int n){
        if(n == 0){
            return "";
        }
        return s + repeat(s,n-1);

    }


}
