public class Main{

    public static void main(String[] args){
        	
        System.out.println("Stack");
        Stack stack =  new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print();
        int i = stack.pop();
        System.out.println(i);
        stack.print();

        int j = stack.peek();
        System.out.println(j);
        stack.print();


    }
}