public class convertToBase10 {
    public int convertToBase10(int[] a, int base) {
        if (isLegalNumber(a, base) == 0) {
            return -1;
        }
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res += a[i] * Math.pow(base, a.length - 1 - i);
        }
        return res;
    }

    private int isLegalNumber(int[] a, int base) {
        if (a[0] == 0) {
            return 0;
        }
        for (int i : a) {
            if (i >= base) {
                return 0;
            }
        }
        return 1;
    }
}
