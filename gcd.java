public class gcd {
    public int gcd(int a, int b, int c) {
        int result = 1;
        int min = a < b ? a : b;
        min = min < c ? min : c;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                result = i;
            }
        }
        return result;
    }
}