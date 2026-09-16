class MinStack {
    private ArrayList<Integer> list;
    private int top;
    private PriorityQueue<Integer> pq;
    public MinStack() {
        this.list = new ArrayList<>();
        this.top = -1;
        this.pq = new PriorityQueue<>();
    }

    public void push(int val) {
        this.top++;
        this.list.add(val);
        this.pq.add(val);
    }

    public void pop() {
        int el = this.list.get(top);
        this.pq.remove(el);
        this.list.remove(this.top);
        this.top--;
    }

    public int top() {
        return this.list.get(top);
    }

    public int getMin() {
        if(pq.isEmpty()){
            return 0;
        }
        return this.pq.peek();
    }
}
