public class isMinMaxDisjoint {
    public int isMinMaxDisjoint(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        int minTimes = 1;
        int maxTimes = 1;
        int minIndex = 0;
        int maxIndex = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                maxTimes++;
            } else if (a[i] == min) {
                minTimes++;
            }
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
                maxTimes = 1;
            }
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
                minTimes = 1;
            }
        }
        if (minTimes == 1 && maxTimes == 1 && ((minIndex - maxIndex) < -1 || (minIndex - maxIndex) > 1)) {
            return 1;
        } else {
            return 0;
        }
    }
}
