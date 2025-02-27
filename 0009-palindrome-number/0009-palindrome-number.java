
class Solution {
    public boolean isPalindrome(int x) {
        String chk = Integer.toString(x);
        int start = 0;
        int end = chk.length() - 1;
        while (start < end) {

            if (chk.charAt(start) != chk.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


}