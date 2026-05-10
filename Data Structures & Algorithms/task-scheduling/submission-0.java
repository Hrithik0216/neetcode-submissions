class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Integer> p = new PriorityQueue<>(
            (a,b)->Integer.compare(b,a)
        );
        Queue<int[]> q = new LinkedList<>();
        for(char c: tasks){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            p.offer(entry.getValue());
        }
        int time = 0;
        while(!p.isEmpty() || !q.isEmpty()){
            time++;
            if(p.isEmpty()){
                time = q.peek()[1];
            }else{
                int c = p.poll()-1;
                if(c>0){
                    
                    q.offer(new int[]{c, time+n});
                }
            }

            if(!q.isEmpty() && q.peek()[1]==time){
                p.offer(q.poll()[0]);
            }
        }
        return time;
    }
}
