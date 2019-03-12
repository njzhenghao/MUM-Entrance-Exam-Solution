public class isRailroadTie {
    public int isRailroadTie(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        if (a.length == 2 && a[0] != 0 && a[1] != 0) {
            return 1;
        }
        if (a[0] == 0 || a[a.length - 1] == 0) {
            return 0;
        }
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != 0) {
                if (!((a[i - 1] == 0 && a[i + 1] != 0) || (a[i - 1] != 0 && a[i + 1] == 0))) {
                    return 0;
                }
            } else {
                if (!(a[i - 1] != 0 && a[i + 1] != 0)) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
