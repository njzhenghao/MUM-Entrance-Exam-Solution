public class largestAdjacentSum {
    public int largestAdjacentSum(int[] a) {
        int largestSum = a[0] + a[1];
        if (a.length < 2) {
            return Integer.MIN_VALUE;
        } else if (a.length == 2) {
            return largestSum;
        }
        for (int i = 2; i < a.length; i++) {
            largestSum = (largestSum < a[i - 1] + a[i]) ? a[i - 1] + a[i] : largestSum;
        }
        return largestSum;
    }
}
