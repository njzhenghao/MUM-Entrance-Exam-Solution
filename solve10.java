public class solve10 {
    static private int TARGET = 10;

    public int[] solve10() {
        int[] fractorials = new int[TARGET];
        for (int i = 0; i < TARGET; ) {
            fractorials[i] = getFactorial(++i);
        }
        for (int out = 0; out < TARGET - 2; out++) {
            for (int in = out + 1; in < TARGET - 1; in++) {
                if (fractorials[out] + fractorials[1] == fractorials[TARGET - 1]) {
                    return new int[]{out + 1, in + 1};
                }
            }
        }
        return null;
    }

    private int getFactorial(int n) {
        int product = 1;
        for (; n > 0; n--) {
            product *= n;
        }
        return product;
    }
}
