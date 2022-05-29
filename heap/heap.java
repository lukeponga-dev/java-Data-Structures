import java.lang.reflect.Array;

public class heap {
    
    int[] heapArray;
    int next = 0;
    public heap(int capacity){
        heapArray = new int[capacity+1];
        next = 1;
    }

    public void print(){
        System.out.println(Array.toString(Heaps));
    }
}
