import java.util.ArrayDeque;
import java.util.Deque;

public class q7 {

    public static int nonRecursive(int a, int b, IntMethod im){
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;

        stack.push(a);

        while(!stack.isEmpty())
        {
            int current = stack.pop();

            if(current <= 2){
                result += im.f(b);
            }
            else {
                stack.push(current-1);
                stack.push(current-1);
            }


        }
        return result;
    }

    public static int strange(int a, int b, IntMethod im) {
        if (a <= 2) {
            return im.f(b);
        }
        return strange(a - 1, b, im) + strange(a - 1, b, im);
    }



}
