import java.util.ArrayList;
import java.util.List;

public class q3 {

    @FunctionalInterface
    public interface Maker<T,U,R> {
        R make(T t, U u);
    }

    static void main(String[] args) {

        Maker<String, Integer, List<String>> mk = (a,b) -> {
            List<String> output = new ArrayList<>();
            if(b == null || b < 0){
                throw new IllegalArgumentException();
            }
            for(int i = 0; i < b; i++)
            {
                output.add(a);
            }
            return output;
        };

        System.out.println(mk.make("Hi", 3));
    }

}
