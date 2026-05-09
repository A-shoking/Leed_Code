class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> mp = new HashMap<>();
       for(int j=0 ; j < nums.length; j++) {

        int to_find = target - nums[j];

        if(mp.containsKey(to_find)){
            return new int []{j,mp.get(to_find)};
        }
            mp.put(nums[j] ,j);
       }

       return new int[]{};
    }
       
}




















 
