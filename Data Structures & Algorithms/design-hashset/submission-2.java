public class Node {
        int value;
        Node next;

        Node(int key) {
            this. value = key;
            this.next = null;
        }
    }
class MyHashSet {
    Node arr[];
    public MyHashSet() {
        arr = new Node[10000];
    }

    private int hash(int key)
    {
        return key%10000;
    }
    
    public void add(int key) {
        int index = hash(key);
        Node current = arr[index];
        while(current != null)
        {
            if(current.value == key)
                return;
            current = current.next ;
        }

         Node obj = new Node(key);
         obj.next = arr[index];
         arr[index] = obj; 
    }
    
    public void remove(int key) {
        int index = hash(key);
        Node prev = null;
        Node  current = arr[index];
        while( current != null)
        {
            if(current.value ==  key)
            {
                if (prev == null)
                    arr[index] = current.next;
                else
                    prev.next = current.next;
            
                return;
            }
            prev = current;
            current = current.next;
        }

    }
    
    public boolean contains(int key) {
        int index = hash(key);

        Node current = arr[index];
        while(current != null)
        {
            if(current.value == key)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */