public class isVanilla {
    public int isVanilla(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int digit = a[0] % 10 < 0 ? 0 - a[0] % 10 : a[0] % 10;
        for (int i : a) {
            i = i < 0 ? 0 - i : i;
            while (i != 0) {
                if (i % 10 != digit) {
                    return 0;
                }
                i /= 10;
            }
        }
        return 1;
    }
}
