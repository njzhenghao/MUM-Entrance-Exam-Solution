public class stantonMeasure {
    public int stantonMeasure(int[] a) {
        int count1=0;
        int result=0;
        for (int i : a) {
            if (i == 1) {
                count1++;
            }
        }
        for (int i : a) {
            if (i == count1) {
                result++;
            }
        }
        return result;
    }
}
