public class isSequentiallyBounded {
    public int isSequentiallyBounded(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int currentNum = Integer.MIN_VALUE;
        int count = 0;
        for (int i : a) {
            if (i < currentNum) {
                return 0;
            } else if (i == currentNum) {
                if (++count >= i) {
                    return 0;
                } else {
                    currentNum = i;
                }
            } else {
                count = 1;
                currentNum = i;
            }
        }
        return 1;
    }

}
