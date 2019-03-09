import java.util.ArrayList;
import java.util.List;

public class guthrieIndex {
    public int guthrieIndex(int n) {
        if (n == 1) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        while (n != 0 && n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }
        if (list.get(list.size() - 1) == 0) {
            return 0;
        } else {
            return list.size();
        }
    }
}
