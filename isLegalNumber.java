public class isLegalNumber {
    public int isLegalNumber(int[] a, int base) {
        if (a[0] == 0) {
            return 0;
        }
        for (int i : a) {
            if (i >= base) {
                return 0;
            }
        }
        return 1;
    }
}
