public class Stack {

    protected Node head;

    /**
     * Constructor
     */
    public Stack() {

        head = null;
    }

    /**
     * Push onto the head of stack
     */
    public void push(int x){
        Node newNode = new Node(x);
        if(isEmpty()){
            head = newNode;
        }
        else{
        newNode.next = head;
        head = newNode;

        }
    }
    public int pop(){
        if(isEmpty()){
            return -1;            
        }
        int value = head.value;
        head = head.next;
        return value;
    }

    /**
     * Peak top of stack
     * @return
     */
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int value = head.value;
        return value;
    }

    /**
     * Check if stack is empty
     */
    public boolean isEmpty() {

        if (head == null) {

            return true;
        }

        return false;
    }

    /**
     * Get the length of the stack
     */
    public int getLength() {

        int counter = 0;

        Node currNode = head;

        while (currNode != null) {

            counter++;

            currNode = currNode.next;
        }

        return counter;
    }

    /**
     * Print the stack
     */
    public void print() {

        Node currNode = head;

        while (currNode != null) {

            System.out.print(currNode.value + "->");

            currNode = currNode.next;
        }

        System.out.println();
    }

}
