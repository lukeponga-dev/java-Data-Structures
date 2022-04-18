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
        System.out.println(queue.getLength());

        queue.print();
    }
}