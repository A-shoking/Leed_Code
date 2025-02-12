class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int suffex = 1 ;
        int[] answer = new int[len];
        int[] left =  new int[len] ;
        int[] right =  new int[len] ;
        int end  = len-1 ;

        left[0] = 1;
        for(int i =1 ; i <len ;i++){
           
           left[i] = left[i-1]* nums[i-1];
          
        }



        right[len-1] = 1;
        for(int j =len-2 ;j >=0 ; j--){
            right[j] = right[j+1] * nums[j+1];
            

        }


        for(int i =0 ; i <len ;i++){
           
           answer[i] = left[i]* right[i];
          
        }



        
       
      return answer;      
    }
       
}