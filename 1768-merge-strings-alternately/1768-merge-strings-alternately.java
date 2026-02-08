class Solution {
    public String mergeAlternately(String word1, String word2) {

    int max = Math.max(word1.length(),word2.length());
    String comb = "";
    for(int i =0; i< max ; i++) {
        if ( i < word1.length()){
            comb += word1.charAt(i);
        }
        if (i < word2.length()){
            comb += word2.charAt(i);
        }
    }
    return comb; 
    }
}