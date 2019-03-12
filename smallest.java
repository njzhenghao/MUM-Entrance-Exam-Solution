public class smallest {
    public int smallest(int n) {
        if (n == 0) {
            return 0;
        }
        int res = 1;
        boolean isCorrect = false;
        while (!isCorrect) {
            boolean allRight = true;
            for (int i = 0; i < n; ) {
                int num = res * ++i;
                if (!contains2(num)) {
                    allRight = false;
                    break;
                }
            }
            if (allRight) {
                isCorrect = true;
            } else {
                res++;
            }
        }
        return res;
    }

    private boolean contains2(int num) {
        boolean contains2 = false;
        while (num != 0) {
            if (num % 10 == 2) {
                contains2 = true;
                num = 0;
                break;
            } else {
                num /= 10;
            }
        }
        return contains2;
    }
}
