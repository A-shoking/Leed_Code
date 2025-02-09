class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
                map.put(num , map.getOrDefault(num , 0) +1);
        }
        
        Set<Integer> myset = new HashSet<>();
        for(int i : map.values()){
            if(!myset.contains(i)){
                myset.add(i);
            }else{
                return false ;
            }
        }

        return true ;
    }
}