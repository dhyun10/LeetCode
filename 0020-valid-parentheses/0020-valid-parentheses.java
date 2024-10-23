class Solution {
    public boolean isValid(String s) {
        Stack<String> st = new Stack<String>();
        String[] arr = s.split("");

        for(String a : arr) {
            if(a.equals("(") || a.equals("[") || a.equals("{")) {
                st.push(a);
            } else if (st.size() > 0) {
                if(a.equals("]")) {
                    if(st.peek().equals("[")) {
                        st.pop();
                    } else {
                        return false;
                    }
                    
                } else if(a.equals(")")) {
                    if(st.peek().equals("(")) {
                        st.pop();
                    }
                    else {
                        return false;
                    }
                } else {
                    if(st.peek().equals("{")) {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }      
        }

        return st.size() == 0 ? true : false;
    }
}