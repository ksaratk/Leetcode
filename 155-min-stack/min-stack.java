class MinStack {
    Node head;
     
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public MinStack() {
        
    }
    
    public void push(int val) {
        Node n = new Node(val);
        if(head==null){
            head = n;
            return;
        }

        n.next = head;
        head = n;
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        int val = head.data;
        return val;
    }
    
    public int getMin() {
        Node temp = head;
        int min = Integer.MAX_VALUE;
        while(temp!=null){
            if(temp.data<min){
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */