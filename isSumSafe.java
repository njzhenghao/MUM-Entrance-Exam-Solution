public class isSumSafe {
    public int isSumSafe(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        for (int i : a) {
            if (i == sum) {
                return 0;
            }
        }
        return 1;
    }
}
