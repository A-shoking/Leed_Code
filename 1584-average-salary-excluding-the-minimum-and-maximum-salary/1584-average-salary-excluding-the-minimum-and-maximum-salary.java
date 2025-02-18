class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double total = 0 ;
        for(int i : salary){
            total += i ;
            if(i > max){
                max = i ;
            }
            if(i < min){
                min = i ;
            }
        }
     
  
        double avg = (total - (min + max))/(salary.length-2);
        return avg;


    }
        
 }
