class decodeArray {
    int decodeArray(int[] a) {
        String res = "";
        for (int i = 1; i < a.length; i++) {
            res += Math.abs(a[i - 1] - a[i]);
        }
        if (a[0] < 0) {
            res = "-" + res;
        }
        return Integer.valueOf(res);
    }
}