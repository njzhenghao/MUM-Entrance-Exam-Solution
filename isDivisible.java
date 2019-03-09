public class isDivisible {
    public int isDivisible(int[] a, int divisor) {
        for (int i : a) {
            if (i % divisor != 0) {
                return 0;
            }
        }
        return 1;
    }

}
