import java.util.HashSet;
import java.util.Set;

public class isPacked {
    public int isPacked(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        Set<Integer> exist = new HashSet<>();
        int currentNum = a[0];
        int count = 0;
        exist.add(currentNum);
        for (int i : a) {
            if (i == currentNum) {
                count++;
            } else if (currentNum != count || exist.contains(i)) {
                return 0;
            } else {
                currentNum = i;
                exist.add(i);
                count = 1;
            }
        }
        return 1;
    }
}
