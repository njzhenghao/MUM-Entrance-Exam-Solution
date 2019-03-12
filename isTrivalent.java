import java.util.HashSet;
import java.util.Set;

public class isTrivalent {
    public int isTrivalent(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        if (set.size() == 3) {
            return 1;
        } else {
            return 0;
        }
    }
}
