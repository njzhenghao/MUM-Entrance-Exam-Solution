public class isSquare {
    public int isSquare(int n) {
        int i = 1;
        while (i * i <= n) {
            if (i * i++ == n) {
                return 1;
            }
        }
        return 0;
    }
}
