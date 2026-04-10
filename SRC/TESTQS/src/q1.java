import java.util.ArrayList;
import java.util.List;

public class q1 {

    public static List<Vehicle> gatherVehicles(Object[] array) {
        List<Vehicle> vList = new ArrayList<>();
        for (Object x : array) {
            if (x instanceof Vehicle a) {
                vList.add(a);
            }

        }
        return vList;
    }
}