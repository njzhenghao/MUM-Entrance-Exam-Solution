public class isMercurial {
    public int isMercurial(int[] a) {
        boolean firstOne = false;
        boolean lastOne = false;
        boolean existThree = false;
        for (int i : a) {
            if (!firstOne) {
                if (i == 1) {
                    firstOne = true;
                }
                continue;
            }
            if (!existThree) {
                if (i == 3) {
                    existThree = true;
                }
                continue;
            }
            if (!lastOne) {
                if (i == 1) {
                    lastOne = true;
                    break;
                }
            }
        }
        if (firstOne && lastOne && existThree) {
            return 0;
        }
        return 1;
    }
}