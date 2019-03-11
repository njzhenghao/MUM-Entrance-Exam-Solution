public class isNUnique {
    public int isNUnique(int[] a, int n) {
        if (a.length < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > n) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (n == a[i] + a[j]) {
                    count++;
                }
            }
        }
        if (count == 1) {
            return 1;
        }
        return 0;
    }

}
