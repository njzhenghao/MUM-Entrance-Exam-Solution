public class isSequencedArray {
    public int isSequencedArray(int[] a, int m, int n) {
        if (a.length < 1) {
            return 0;
        }
        //exchange each other if m>n
        if (m > n) {
            m += n;
            n = m - n;
            m -= n;
        }
        if (a[0] != m || a[a.length - 1] != n) {
            return 0;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1] || (a[i] == a[i - 1] + 1)) {
                continue;
            }
            return 0;
        }
        return 1;
    }

    private boolean isBetweenMN(int num, int m, int n) {
        if (num >= m && num <= 0) {
            return true;
        }
        return false;
    }
}
