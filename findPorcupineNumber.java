public class findPorcupineNumber {
    public int findPorcupineNumber(int n) {
        while (true) {
            if (isPrime(++n) && endWith9(n)) {
                int j = n;
                while (true) {
                    if (isPrime(++j)) {
                        if (endWith9(j)) {
                            return n;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean endWith9(int n) {
        if (n % 10 == 9) {
            return true;
        }
        return false;
    }
}
