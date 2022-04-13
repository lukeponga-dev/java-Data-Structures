public class Main{
    public static void main(String[] args){
        Hashtable hashtable = new Hashtable();

        System.out.println("hash table");

        hashtable.insert(6,"a");
        hashtable.insert(7, "b");
        hashtable.insert(8, "c");
        hashtable.insert(9, "d");
        hashtable.insert(3, "f");
        hashtable.insert(10, "hi");
        

        hashtable.print();
        hashtable.delete(8);
hashtable.print();

    }
}