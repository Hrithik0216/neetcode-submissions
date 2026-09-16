class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int res = 1; boolean encountered = false;
        int data = 0;
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                int b = st.pop();
                int a = st.pop();
                st.push(a+b); 
            }
           else if(tokens[i].equals("*")){
                int b = st.pop();
                int a = st.pop();
                st.push(a*b); 
            }
            else if(tokens[i].equals("-")){
                int b = st.pop();
                int a = st.pop();
                st.push(a-b); 
            }
            else if(tokens[i].equals("/")){
               int b = st.pop();
                int a = st.pop();
                st.push(a/b); 
            }else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        if(!st.isEmpty()){
            return st.pop();
        }
        return 0;
    }
}
