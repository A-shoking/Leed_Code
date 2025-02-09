class Solution {
    public boolean isValid(String s) {
         HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stk = new Stack<>();
        for(int i=0 ; i < s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i)=='(' || s.charAt(i) == '['){
                stk.push(s.charAt(i));
            }else{
                if(stk.isEmpty() || stk.pop() !=map.get(s.charAt(i)) ){
                    return false ;
                }
            }
        }
        if(!stk.isEmpty()){
            return false ;
        }
        return true ;
    }
}