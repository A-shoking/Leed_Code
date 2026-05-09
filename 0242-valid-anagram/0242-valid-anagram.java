class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char c : t.toCharArray()){
             mp.put(c , mp.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
              mp.put(c , mp.getOrDefault(c, -1) - 1);
        }
        System.out.print(mp);
        for(int i : mp.values()){
            if(i !=0){
                return false;
            }
        }

        return true;
        
    }
}