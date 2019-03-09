public class sumFactor {
    public int sumFactor(int[] a) {
        int sum = 0;
        int result=0;
        for (int i : a) {
            sum += i;
        }
        for (int i : a) {
            if (i == sum) {
                result++;
            }
        }
        return result;
    }
}
