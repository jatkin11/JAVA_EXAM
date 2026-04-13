import java.util.HashMap;
import java.util.Map;

public class memoisation {

    public static int pathsMemo(int n)
    {
        if(n < 0){
            throw new IllegalArgumentException();
        }

        Map<Integer,Integer> memo = new HashMap<>();
        return pathsMemoHelper(n,memo);
    }


    public static int pathsMemoHelper(int n,Map<Integer,Integer> memo)
    {
        int result =0;

        if(n<0){return 0;}

        if(n==0){return 1;}

        if(memo.containsKey(n))
        {
            return memo.get(n);
        }
        result = pathsMemoHelper(n-1,memo) + pathsMemoHelper(n-2, memo) + pathsMemoHelper(n-3,memo);
        memo.put(n,result);

        return result;
    }

}
