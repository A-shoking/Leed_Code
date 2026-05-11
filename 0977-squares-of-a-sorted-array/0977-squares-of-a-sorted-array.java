class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sq_arr = new int[nums.length];
        int start =0;
        int end = nums.length-1;

        for(int i=sq_arr.length-1 ; i >=0 ;i--) {
            int sq_start =  nums[start] * nums[start];
            int sq_end = nums[end] * nums[end];
            if(sq_end > sq_start) {
                sq_arr[i] = sq_end;
                end--;
            }else {
                sq_arr[i] = sq_start;
                start++;
            }
        }
        return sq_arr;
    }
}