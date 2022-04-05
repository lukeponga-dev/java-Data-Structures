public class Queue {

    Node head;

    /**
     * Constructor
     */
    public Queue() {
        head = null;
    }

    /**
     * Check if queue is empty
     */
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    /**
     * Get the length of the queue
     */
    public int getLength() {
        int counter = 0;
        Node current = head;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }
    /**
    Enqueue
    */
    public void enqueue(int x){
        Node newNode = new Node(x);
        if(head == null) {
            head = newNode;
        }
        else{
            Node current = head;
            while (current.next != null) {
                current = current.next;

            }
            current.next = newNode;
        }
    }
/**
 * Dequeue
 */
public int dequeue(){
    if(head == null) {
        return -1;
    }
    int value = head.value;
    head = head.next;
    return value;
}

    /**
     * Print the queue
     */
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -->");
            current = current.next;
        }
        System.out.println();
    }
}
