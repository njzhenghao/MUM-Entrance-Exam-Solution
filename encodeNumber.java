import java.util.ArrayList;
import java.util.List;

class encodeNumber {
    int[] encodeNumber(int n) {
        if (n <= 1) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        while (n % 2 == 0) {
            n >>= 1;
            list.add(2);
        }
        int divideNum = 3;
        while (n != 1) {
            if (n % divideNum == 0) {
                n /= divideNum;
                list.add(divideNum);
            } else {
                divideNum += 2;
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}