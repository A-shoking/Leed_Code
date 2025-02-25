class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> feqArray = new ArrayList<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);  
        }
        for(int count : map.values()){
            feqArray.add(count);
        }
         Collections.sort(feqArray);

         int elemnts = feqArray.size();
         int j =0;
         while(k > 0 &&  j < feqArray.size()){
            if(k >= feqArray.get(j)){
                k = k - feqArray.get(j);
                elemnts--;
            }
                j++;
                

         }
         return elemnts ;
    }
}