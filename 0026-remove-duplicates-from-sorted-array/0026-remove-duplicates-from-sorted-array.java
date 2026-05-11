class Solution {
    public int removeDuplicates(int[] nums) {
        int  left =0;
        int right =1;
        int unq=1;

        while(right < nums.length){
            if(nums[right] == nums[right-1]){
                right++;
            }else {
                unq +=1;
                left++;
                nums[left] = nums[right];
                right++;

            }
        }
        return unq;
    }
}