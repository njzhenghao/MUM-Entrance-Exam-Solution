public class matches {
    public int matches(int[] a, int[] p) {
        int count = 0;
        for (int i : p) {
            count += i > 0 ? i : 0 - i;
        }
        if (a.length != count) {
            return 0;
        }
        int index = 0;
        for (int out : p) {
            int start = index;
            for (; start < (index + out > 0 ? out : 0 - out); start++) {
                if ((out > 0 && a[start] < 0) || (out < 0 && a[start] > 0)) {
                    return 0;
                }
            }
            index += start;
        }
        return 1;
    }
}
