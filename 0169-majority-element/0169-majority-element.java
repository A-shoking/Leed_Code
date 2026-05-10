class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num , mp.getOrDefault(num,0) +1);
        }
        int res =0;
        for(int nmb : nums) {
            if(mp.get(nmb) > nums.length/2){
               res = nmb;
            }
        }

        return res;
    }
}