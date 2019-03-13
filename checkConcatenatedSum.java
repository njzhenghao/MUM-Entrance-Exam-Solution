public class checkConcatenatedSum {
    public int checkConcatenatedSum(int n, int catlen) {
        StringBuilder catlenStr = new StringBuilder();
        for (int i = 0; i < catlen; i++) {
            catlenStr.append(1);
        }
        if (n % Integer.valueOf(catlenStr.toString()) == 0) {
            return 1;
        }
        return 0;
    }
}
