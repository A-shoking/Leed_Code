class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        boolean hasOdd = false;
        int lp = 0;
        for(char c : mp.keySet()){
            if(mp.get(c)%2 ==0){
                lp = lp+mp.get(c);
            }else {
                lp = lp + mp.get(c) -1;
                hasOdd =true;
            }
        }
        if(hasOdd){
            lp++;
        }



        return lp;
    }
}