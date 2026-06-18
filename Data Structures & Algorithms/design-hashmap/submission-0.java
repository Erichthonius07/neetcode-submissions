class Node {
    int key;
    int val;
    Node next;
    Node(int key, int value) {
        this.val = value;
        this.next = null;
        this.key = key;
    }
}
class MyHashMap {
    Node table[];
    public MyHashMap() {
        table = new Node[1009];
    }
    
    public void put(int key, int value) {
        int index = key % 1009;

        Node current = table[index];
        while (current != null) {
            if (current.key == key) {
                current.val = value;
            return;
        }
        current = current.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }
    
    public int get(int key) {
        int index = key%1009;
        Node current = table[index];
        while(current != null)
        {
            if(current.key == key)
            {
                return current.val;
            }
            current = current.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = key%1009;
        Node prev = null;
        Node current = table[index];
        while(current != null) {
            if(current.key ==key)
            {
                if(prev == null)
                    table[index] = current.next;
                else
                    prev.next = current.next;
                
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}
