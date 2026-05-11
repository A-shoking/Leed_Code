class Solution {
    public int maxArea(int[] height) {
        int max_wt = Integer.MIN_VALUE;
        int start = 0;
        int end = height.length-1;

        while(start < end) {
            int area = (end - start)* Math.min(height[start],height[end]);
            if(area > max_wt) {
                max_wt = area;
            }
            if(height[end]<= height[start]){
                end--;
            }else {start++;}

        }
    return max_wt;

    }
}