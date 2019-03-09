public class isCentered15 {
    public int isCentered15(int[] a) {
        for (int position = 0; 2 * position < a.length; position++) {
            int sum = 0;
            for (int index = position; index < a.length - position; index++) {
                sum += a[index];
            }
            if (sum == 15) {
                return 1;
            }
        }
        return 0;
    }
}
