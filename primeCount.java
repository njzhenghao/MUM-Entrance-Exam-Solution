public class primeCount {
    public int primeCount(int start, int end) {
        if (end == 1) {
            return 0;
        }
        if (start < 1) {
            start = 2;
        }
        int result = 0;
        for (; start <= end; start++) {
            boolean isPrime = true;
            for (int i = 2; i < start; i++) {
                if (start % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result++;
            }
        }
        return result;
    }
}