public class isIsolated {
    public int isIsolated(long n) {
        if (n > 2097151 || n < 1) {
            return -1;
        }
        long squre = n * n;
        long cube = squre * n;
        String string = String.valueOf(squre);
        while (cube != 0) {
            if (string.contains(String.valueOf(cube % 10))) {
                return 0;
            }
            cube /= 10;
        }
        return 1;
    }
}
