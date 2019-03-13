public class getExponent {
    public int getExponent(int n, int p) {
        if (p <= 1) {
            return -1;
        }
        if (n < 0) {
            n = 0 - n;
        } else if (n == 0) {
            return 0;
        }
        int res = 0;
        int count = 0;
        while (n >= Math.pow(p, count)) {
            if (n == Math.pow(p, count)) {
                return count;
            } else if (n % Math.pow(p, count) == 0) {
                res = count++;
            } else {
                count++;
            }
        }
        return res;
    }
}
