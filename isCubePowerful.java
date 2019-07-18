class isCubePowerful {
    int isCubePowerful(int n) {
        if (n < 1) {
            return 0;
        }
        int num = n;
        int sum = 0;
        while (num != 0) {
            sum += Math.pow(num % 10, 3);
            num /= 10;
        }
        return sum == n ? 1 : 0;
    }
}