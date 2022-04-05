public class Main {
    public static void main(String[] args) {
        System.out.println("BST");

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(4);
        bst.insert(16);
        bst.insert(1);
        bst.insert(6);
        bst.insert(20);
        bst.insert(15);
        bst.printTree();
        System.out.println();
        bst.print();
        System.out.println("Search for value = " + bst.search(20));
    }
}
