public class Main{

    public static void main(String[] args){
        System.out.println("Queue");

        Queue queue = new Queue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.print();
        
        int i = queue.dequeue();
        System.out.println(i);
        // int x = queue.dequeue();
        // int y = queue.dequeue();
        // int e = queue.dequeue();

        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(e);

        System.out.println("length: " + queue.getLength());
queue.enqueue(60);
        queue.print();
    }
}