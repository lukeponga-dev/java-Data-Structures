public class Hashtable {

    Node[] table;
    int size;

    int noOfFullEntries;
    int noOfCollisions;
    int noOfRehashes;

    public Hashtable() {
        size = 5;
        table = new Node[size];
        noOfFullEntries = 0;
        noOfCollisions = 0;
        noOfRehashes = 0;
    }

    public int hashFunction(int key) {
        int index = key % size; // modulus divides and returns the remainder node
        return index;
    }

    // Methods

    //insert
    public void insert(int key, String value) {
        int index = hashFunction(key);

        double loadFactor = (double) noOfFullEntries / (double) size;
        if (loadFactor > 0.75) {
            noOfRehashes++;
        }
        if (table[index] == null) {
            Node node = new Node(key, value);

            table[index] = node;
            noOfFullEntries++;
        } else {
            Node node = new Node(key, value);
            table[index] = node;
            noOfCollisions++;
        }
    }
    //delete
    public void delete(int key) {
        int index = hashFunction(key);
        if(table[index] != null){
            table[index] = null;
            noOfFullEntries--;
        }
    }

    // print
    public void print() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                System.out.println(i + ": null");
            } else {
                Node node = table[i];
                System.out.println(i + ": " + node.key + ": " + node.value);
            }
        }
    }

    // print key
    public void print(int key) {

    }
}
