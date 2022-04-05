public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Method Insert
    public void insert(int x) {
        root = insertR(root, x);
    }

    // Insert down the right subtree if greater than root
    public Node insertR(Node cRoot, int x) {
        // No tree so add it
        if (cRoot == null) {
            Node newNode = new Node(x);
            cRoot = newNode;
        }
        // Move down the left subtree
        else if (x < cRoot.value) {
            cRoot.left = insertR(cRoot.left, x);
        }
        // Move down the right subtree
        else if (x > cRoot.value) {
            cRoot.right = insertR(cRoot.right, x);

        }
        return cRoot;
    }

    // Search Method
    public boolean search(int x) {
        boolean found = searchR(root, x);
        return found;
    }

    // Search Method
    public boolean searchR(Node cRoot, int x) {
        boolean found = false;
        // No tree so add here
        if (cRoot == null) {
            return false;
        } else if (cRoot.value == x) {
            return true;
        }
        // Search the Left subtree
        else if (x < cRoot.value) {
            found = searchR(cRoot.left, x);
        }
        // Search the Right subtree
        else if (x > cRoot.value) {
            found = searchR(cRoot.right, x);
        }
        return found;
    }

    public void print() {
        printR(root);
    }

    public void printR(Node cRoot) {
        if (cRoot == null) {
            return;
        }
        System.out.print("root: " + cRoot.value + " ");
        if (cRoot.left == null) {
            System.out.print(" | left: null");
        } else {
            System.out.print(" | left" + cRoot.left.value);
        }
        if (cRoot.right == null) {
            System.out.print(" | right: null");
        } else {
            System.out.print(" | right" + cRoot.right.value);
        }

        System.out.println();
        printR(cRoot.left);
        printR(cRoot.right);
    }

    public void printTree() {
        System.out.println("Tree:");
        BSTPrinter.printNode(root);
    }

}
