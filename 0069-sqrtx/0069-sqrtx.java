class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        if (x < 2) {
            return x;
        }
        while (start <= end) {
            int medium = start + (end - start) / 2;
            long sq = (long) medium * medium;
            if (sq == x) {
                return medium;
            } else if (sq < x) {
                start = medium + 1;
            } else if (sq > x) {
                end = medium - 1;
            }
        }
        return end;

    }
}