class Solution {
    public String reverseVowels(String s) {   
         HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        // Convert string to a character array since strings are immutable
        char[] chars = s.toCharArray();
        int start = 0;
        int last = chars.length - 1;

        // Two-pointer approach
        while (start < last) {
            // Move start pointer until it points to a vowel
           
             if(!vowels.contains(chars[start])){
                    start++;
                }
            // Move last pointer until it points to a vowel
             if(!vowels.contains(chars[last])){
                     last--;
                }
            if( vowels.contains(chars[start]) && vowels.contains(chars[last]) ){
            // Swap vowels
                char temp = chars[start];
                chars[start] = chars[last];
                chars[last] = temp;

                // Move pointers
                start++;
                last--;
            }
        }

        // Convert character array back to string
        return new String(chars);
        
    }
}