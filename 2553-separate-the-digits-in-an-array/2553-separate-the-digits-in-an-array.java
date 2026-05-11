class Solution {
    public int[] separateDigits(int[] nums) {

        List<Integer> arr = new ArrayList<>();
        for(int i : nums){
            if(i > 9){
                for(char c : (String.valueOf(i)).toCharArray()) {
                    arr.add(c-'0');
                }

            }else {
                arr.add(i);
            }
        }
         int[] res = new int[arr.size()];
         for (int j =0 ; j< res.length; j++){
            res[j] = arr.get(j);

         } 


        return res;
        
    }
}