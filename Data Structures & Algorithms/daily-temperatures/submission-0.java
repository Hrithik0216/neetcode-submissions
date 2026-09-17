class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[temperatures.length];
        if (temperatures.length > 0) {
            st.push(0);
        }
        int idx = 1;
        while (idx < temperatures.length) {
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[idx]) {
                int prevIdx = st.pop();
                arr[prevIdx] = idx - prevIdx;
                
            }
            st.push(idx);
            idx++;
        }

        return arr;
    }
}
