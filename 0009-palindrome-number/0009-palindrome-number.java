class Solution {
    public boolean isPalindrome(int x) {

        String chk = Integer.toString(x);
        int left_ptr = 0;
        int right_ptr = chk.length()-1;

        while(left_ptr < right_ptr) {
            if(chk.charAt(left_ptr) == chk.charAt(right_ptr)){
                left_ptr++;
                right_ptr--;
            } else {
                    return false;
            }
        }
        return true;    
    }
}