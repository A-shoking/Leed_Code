class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double total = 0 ;
        for(int i : salary){
            if(i > max){
                max = i ;
            }
            if(i < min){
                min = i ;
            }
        }
       // System.out.println(min);
        //System.out.println(max);
        for(int i : salary){
            if(i == min || i == max){
                continue;
            }
            total += i ; 

        }
        //System.out.print("total"+ total);
        double avg = total/(salary.length-2);
        return avg;


    }
        
 }
