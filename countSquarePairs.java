import java.util.ArrayList;
import java.util.Collections;

public class countSquarePairs {
    public int countSquarePairs(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        Collections.sort(list);
        for (int out = 0; out < list.size() - 1; out++) {
            if (list.get(out) < 1) {
                continue;
            }
            for (int in = out + 1; in < list.size(); in++) {
                double sqrt = Math.sqrt(list.get(out) + list.get(in));
                if (sqrt * 10 % 10 == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
