public class repsEqual {
    public int repsEqual(int[] a, int n) {
        int index = 0;
        int res = 0;
        while (a[index] == 0) {
            index++;
        }
        for (; index < a.length; index++) {
            res += a[index] * Math.pow(10, a.length - 1 - index);
        }
        if (res == n) {
            return 1;
        } else {
            return 0;
        }
    }
}
