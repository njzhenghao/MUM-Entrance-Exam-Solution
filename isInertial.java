import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class isInertial {
    public int isInertial(int[] a) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i : a) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        if (odd.size() == 0 || even.size() == 0) {
            return 0;
        }
        Collections.sort(odd);
        if (even.size() == 1) {
            if (even.get(0) > odd.get(even.size() - 1)) {
                return 1;
            } else {
                return 0;
            }
        }
        Collections.sort(even);
        if (even.get(even.size() - 1) < odd.get(odd.size() - 1)) {
            return 0;
        }
        if (even.get(even.size() - 2) < odd.get(0)) {
            return 1;
        }
        return 0;
    }
}
