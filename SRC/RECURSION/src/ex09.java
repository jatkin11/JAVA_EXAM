import java.util.*;

public class ex09 {

    public static <E> Set<List<E>> computeAllPermutations(List<E> input){
        Set<List<E>> output = new HashSet<>();

        if(input.isEmpty()){
            output.add(new ArrayList<>());
            return output;}

        for(int i = 0; i < input.size(); i++)
        {
            E prefix = input.get(i);
            List<E> copy = new ArrayList<>(input);
            copy.remove(i);

            Set<List<E>> smallerList = computeAllPermutations(copy);

            for(List<E> perm : smallerList)
            {
                List<E> newPerm = new ArrayList<>();
                newPerm.add(prefix);
                newPerm.addAll(perm);
                output.add(newPerm);
            }

        }
        return output;
    }

    static void main() {
        List<Integer> x = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(computeAllPermutations(x));
    }

}
