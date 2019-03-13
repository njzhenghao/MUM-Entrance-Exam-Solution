public class is121Array {
    public int is121Array(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        int countBegin1 = 0;
        int countEnd1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                countBegin1++;
            } else {
                break;
            }
        }
        for (int i = a.length - countBegin1; i < a.length; i++) {
            if (a[i] == 1) {
                countEnd1++;
            }
        }
        if (countBegin1 != countEnd1 || countBegin1 == a.length || countBegin1 == 0) {
            return 0;
        }
        for (int i = countBegin1; i < a.length - countBegin1; i++) {
            if (a[i] != 2) {
                return 0;
            }
        }
        return 1;
    }
}
