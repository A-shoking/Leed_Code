class Solution {
    public int subarraySum(int[] nums, int k) {
        int total = 0 ;
        int count = 0 ;
        for(int start=0 ; start< nums.length; start++){
            int sum = 0 ;
            for(int end =start ; end < nums.length; end++){
                 sum = sum + nums[end];
                if(sum == k ){
                    count++;
            }

            }
        }
        return count ;
     
    }
}