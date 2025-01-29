class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int len = height.length - 1;
        int start = 0;
        int end = len;

        while (end > start) {
            int ptr1 = height[start];
            int ptr2 = height[end];
            int hgt = Math.min(ptr1, ptr2);
            int bth = end - start;
            int area = hgt * bth;
            if (area > max) {
                max = area;

            }
            if (ptr2 <= ptr1) {
                end--;
            } else if (ptr1 <= ptr2) {
                start++;
            }

        }

        return max;

    }
}