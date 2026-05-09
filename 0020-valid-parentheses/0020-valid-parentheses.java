class Solution {
    public boolean isValid(String s) {

        Map<Character,Character> mp = new HashMap<>();
        mp.put(')','(');
        mp.put('}','{');
        mp.put(']','[');

        Stack<Character> st = new Stack<>();

        for(char b : s.toCharArray()) {
            System.out.println(b);
            if(b == '(' || b=='{' || b == '['){
                st.push(b);
            }else if (!st.isEmpty()) {
                if(st.peek() == mp.get(b)){
                    st.pop();
                } else{
                    return false;
                }
            } else{
                return false;
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }

}