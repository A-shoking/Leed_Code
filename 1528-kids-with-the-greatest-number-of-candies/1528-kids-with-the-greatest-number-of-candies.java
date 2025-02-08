class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = 0 ;
        for(int i =0 ; i < candies.length;i++){
            if(max< candies[i]){
                max = candies[i]; 
            }

        }  
        for(int j=0 ; j < candies.length;j++){
            if(max <= (candies[j] + extraCandies) ){
                result.add(true);
            }else{ result.add(false);}
           
        }
        return result ;
        
    }
}