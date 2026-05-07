class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max_candies = 0 ;
        List<Boolean> res = new ArrayList<>();
      for(int i : candies){
        if(i >= max_candies){
            max_candies = i;
        }
      }
      for(int can: candies){
        if(can+extraCandies >= max_candies){
            res.add(true);
        }else{
            res.add(false);
        }
      }
      return res;
    }
}