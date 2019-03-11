public class isStacked {
    public int isStacked(int n) {
        int stackedNum = 0;
        int i = 1;
        while (stackedNum < n) {
            stackedNum += i++;
            if (stackedNum == n) {
                return 1;
            }
        }
        return 0;
    }
}
