public class henry {
    public int henry(int i, int j) {
        if (i == 0 || j == 0) {
            return 0;
        }
        int[] perfectNums = getPerfectNum(i > j ? i : j);
        return perfectNums[i - 1] + perfectNums[j - 1];
    }

    private int[] getPerfectNum(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int perfectNum = res[i == 0 ? 0 : i - 1];
            int start = perfectNum + 1;
            while (getSumOfFactors(start) != start) {
                start++;
            }
            res[i] = start;
        }
        return res;
    }

    private int getSumOfFactors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
