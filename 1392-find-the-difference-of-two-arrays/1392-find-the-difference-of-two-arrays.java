class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int num : nums1){
        map.put(num ,0);
      }
      for(int nu : nums2){
        if(map.containsKey(nu))
        map.remove(nu);
      }
      List<Integer> arr = new ArrayList<>();
      for(int val : map.keySet()){
        arr.add(val);
      }

      HashMap<Integer,Integer> map2 = new HashMap<>();
      for(int num : nums2){
        map2.put(num ,0);
      }
      for(int nu : nums1){
        if(map2.containsKey(nu))
        map2.remove(nu);
      }
      List<Integer> arr2 = new ArrayList<>();
      for(int val : map2.keySet()){
        arr2.add(val);
      }
      ans.add(arr);
      ans.add(arr2);


      return ans ;
    }
}