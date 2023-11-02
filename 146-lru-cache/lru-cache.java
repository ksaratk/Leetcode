class LRUCache {
    Node head;
    class Node{
        int key;
        int data;
        Node next;
        Node prev;

        Node(int key, int data){
            this.key = key;
            this.data = data;
        }        
    }
    int capacity;
    Map<Integer, Node> map = new HashMap();
    Node left = new Node(0,0);
    Node tail = new Node(0,0);
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = left;
        tail.prev = head;
        head.next = tail;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node =  map.get(key);
            int val = node.data;
            remove(node);
            map.remove(key);
            insert(node);
            return val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
       if(map.size()==capacity){
           remove(tail.prev);
       }
       insert(new Node(key, value));
    }

    public void insert(Node node){
        map.put(node.key, node);

       Node temp = head.next;
       node.next = temp;
       node.next.prev = node;
       head.next = node;
       node.prev = head;
    }
    public void remove(Node node){
       map.remove(node.key);
       node.prev.next = node.next;
       node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */