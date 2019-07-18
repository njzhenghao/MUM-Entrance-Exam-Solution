class largestPrimeFactor {
    int largestPrimeFactor(int n) {
        if (n == 1) {
            return 0;
        }
        int result = -1;
        while (n % 2 == 0) {
            result = 2;
            n >>= 1;
        }
        int divideNum = 3;
        while (n != 1) {
            if (n % divideNum == 0) {
                n /= divideNum;
                result = divideNum;
            } else {
                divideNum += 2;
            }
        }
        return result;
    }
}