import java.util.HashSet;
import java.util.Set;

public class ex10 {

    public static Set<String> computeAllPermutations(String input)
    {
        Set<String> output = new HashSet<>();

        if(input.isEmpty()){
            output.add("");
            return output;
        }

        for(int i = 0; i < input.length(); i++)
        {
            char prefix = input.charAt(i);
            String remaining = input.substring(0,i) + input.substring(i+1);

            Set<String> smallerList = computeAllPermutations(remaining);

            for(String s : smallerList)
            {
                output.add(prefix + s);
            }
        }
    return output;
    }



    static void main() {
        System.out.println(computeAllPermutations("test"));



    }




}
