class Solution {
    public boolean isPalindrome(int x) {
        String chk = Integer.toString(x);
        char left = 0;
        char right = chk.length() - 1;

        while(left < right) {
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}