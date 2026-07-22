class Solution {
    public boolean isValid(String s) {
        Stack stack =new Stack<>();
        //push open brackets //if close brackets -look up
        Map <Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        char [] charArray = s.toCharArray();
        for(char c : s.toCharArray()) {
            if(c == '{' || c == '('
             || c == '['){
                stack.push(c);
             }
             else if (map.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != map.get(c)) return false;
             }
        }
        return stack.isEmpty();
    }


}
