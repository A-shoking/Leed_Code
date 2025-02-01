class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i =0 ; i < arr.length-1; i++){
            int diff = Math.min(arr[i+1]-arr[i], min);
            if(diff < min){
                min = diff;
            }
        }
            for(int j =0 ; j < arr.length-1 ; j++){
                int dif = Math.abs(arr[j+1] - arr[j]);
                List<Integer> pair = new ArrayList<Integer>();
                if(dif == min){
                    pair.add(arr[j]);
                    pair.add(arr[j+1]);
                    res.add(pair);

                }
            }
           
        
        return res ; 
    }
}