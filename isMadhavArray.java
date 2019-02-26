public class isMadhavArray {
    public int isMadhavArray(int[] a) {
        int n = 2;
        boolean isCorrectLength = false;
        while (n * (n + 1) <= 2 * a.length) {
            if (n * (n + 1) == 2 * a.length) {
                isCorrectLength = true;
                break;
            } else {
                n++;
            }
        }
        if (!isCorrectLength) {
            return 0;
        }
        int num = 2;
        for (int i = 1; i < a.length; ) {
            int sum = 0;
            for (int j = i; j < i + num; j++) {
                sum += a[j];
            }
            if (sum != a[0]) {
                return 0;
            }
            i += num++;
        }
        return 1;
    }
}