public class is235Array {
    public int is235Array(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int num2 = 0;
        int num3 = 0;
        int num5 = 0;
        int numOthers = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                num2++;
            }
            if (i % 3 == 0) {
                num3++;
            }
            if (i % 5 == 0) {
                num5++;
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                numOthers++;
            }
        }
        if (num2 + num3 + num5 + numOthers == a.length) {
            return 1;
        } else {
            return 0;
        }
    }
}