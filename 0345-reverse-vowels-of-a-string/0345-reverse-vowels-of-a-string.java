class Solution {
    public String reverseVowels(String s) {
        Set<Character> keys = new HashSet<>();
        keys.add('a');
        keys.add('e');
        keys.add('i');
        keys.add('o');
        keys.add('u');
       
        int left = 0;
        int right = s.length()-1;
       System.out.println(right);

    StringBuffer sb = new StringBuffer(s);
       while (left < right) {
        char left_vowel = s.charAt(left);
        char right_vowel = s.charAt(right);
        if (!keys.contains( Character.toLowerCase(left_vowel))) {
            left++;
            continue;
        } 
        if (!keys.contains(Character.toLowerCase(right_vowel))) {
            right--;
            continue;
        }
        sb.setCharAt(left, right_vowel);
        sb.setCharAt(right, left_vowel);
        left++;
        right--;

       }

        return sb.toString();
    }
}