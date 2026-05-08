class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int start =0;
        int right = 1;
        while (right < nums.length) {
            if (nums[start] == nums[right]) {
                return true;
            } else {
                start++;
                right++;
            }
        }
        return false;  
    }
}