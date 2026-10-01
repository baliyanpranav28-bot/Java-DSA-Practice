class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {//opening
                st.push(c);
            } 
            else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop(); //closing
                if (c == ')') {
                    if (top != '(') return false;
                    } 
                    else if (c == '}') {
                        if (top != '{') return false;
                    } 
                    else if (c == ']') {
                        if (top != '[') return false;
                    }
                 }
            }
            return st.isEmpty();
    }
}