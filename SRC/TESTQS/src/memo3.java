import java.util.HashMap;
import java.util.Map;

public class memo3 {

    public static int minCostMemo(int n){

        if(n<0){
            throw new IllegalArgumentException();
        }

        Map<Integer,Integer> memo =  new HashMap<>();

        return minCostMemoHelper(n,memo);

    }



    public static int minCostMemoHelper(int n, Map<Integer,Integer> memo){
        if (n < 0) {
            return Integer.MAX_VALUE;
        }

        if (n == 0) {
            return 0;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int a = minCostMemoHelper(n - 1, memo);
        int b = minCostMemoHelper(n - 3, memo);

        int costA = (a == Integer.MAX_VALUE) ? Integer.MAX_VALUE : a + 2;
        int costB = (b == Integer.MAX_VALUE) ? Integer.MAX_VALUE : b + 5;

        int result = Math.min(costA, costB);
        memo.put(n, result);
        return result;

    }


}
