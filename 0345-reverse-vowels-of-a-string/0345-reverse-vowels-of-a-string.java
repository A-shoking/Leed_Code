class Solution {
    public String reverseVowels(String s) {
      Set<Character> st = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

      int left = 0;
      int right = s.length()-1;
      StringBuilder sb = new StringBuilder(s);
      while(left < right) {
        if(!st.contains(s.charAt(left))) {
            left++;
        }else if(!st.contains(s.charAt(right))){
            right--;
        }else {
            char temp = s.charAt(right);
            sb.setCharAt(right,s.charAt(left));
           sb.setCharAt(left,temp);
           left++;
           right--;

        }
      }
    return sb.toString();
    }
}