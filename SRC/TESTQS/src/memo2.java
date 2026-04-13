import java.util.HashMap;
import java.util.Map;

public class memo2 {

    public static int longestMemo(String a, String b)
    {
        if(a == null || b == null){
            throw new NullPointerException();
        }

        Map<Map<String,String>, Integer> memo = new HashMap<>();
        return longestMemoHelper(a,b,memo);

    }

    public static int longestMemoHelper(String a, String b, Map<Map<String,String>, Integer> memo){

        Map<String,String> both = new HashMap<>();
        both.put(a,b);

        int result = 0;

        if(a.isEmpty() || b.isEmpty()){
            return 0;
        }

        if(memo.containsKey(both)){
            return memo.get(both);
        }

        if(a.charAt(0) == b.charAt(0))
        {
            return 1 + longestMemoHelper(a.substring(1),b.substring(1),memo);
        }

        result = Math.max(longestMemoHelper(a.substring(1),b,memo), longestMemoHelper(a,b.substring(1),memo));
        memo.put(both,result);
        return result;

    }




}
