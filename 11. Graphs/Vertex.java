import java.util.ArrayList;

/**
 * {@link Vertex}
 * {@summary Node class}
 * 
 * {@author Luke Ponga}
 */
public class Vertex {

    // list of neighbours
    public String value;

    // can be <Interger>
    ArrayList<Vertex> neighbours;

    /**
     * constructor
     * 
     * @param s
     */
    public Vertex(String s) {
        value = s;
        neighbours = new ArrayList<Vertex>();
    }

    public void addNeighbour(Vertex v) {
        neighbours.add(v);
    }

    public void removeNeighbour(Vertex v) {
        neighbours.remove(v);
    }

    public Vertex getNeighbour(String s) {
        for (Vertex v : neighbours) { // for each item in max list
            if (v.value.equals(s)) {
                return v;
            }
        }
        return null;
    }

    public ArrayList<Vertex> getNeighbours() {
        return neighbours;
    }

    public String toString() {
        return value;
    }
}
