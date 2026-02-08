class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max_candies = 0 ;
        List<Boolean> result = new ArrayList<>();
        for (int can: candies) {
            if (can > max_candies){
                max_candies = can;
            }
        }
        for (int candi : candies) {
           result.add(candi + extraCandies >= max_candies);
        }
        return result;
        
    }
}