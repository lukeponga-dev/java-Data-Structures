import java.util.ArrayList;
import javax.swing.text.Document;;

public class Graph {
    // Constructors
    ArrayList<Vertex> vertices;

    public Graph() {
        vertices = new ArrayList<Vertex>();
    }

    /**
     * Add vertex
     * 
     * @param s
     */
    public void addVertex(String s) {
        Vertex vertex = new Vertex(s); // Create new vertex

        // Check if vertex doesn't exsist
        if (getVertex(s) == null) {
            vertices.add(vertex); // add vertex to vertices
        }
    }

    /**
     * Add Edges to graph
     * 
     * @param s1
     * @param s2
     */
    public void addEdges(String s1, String s2) {
        Vertex v1 = getVertex(s1);
        Vertex v2 = getVertex(s2);

        // If s1 or s2 null do nothing
        if (v1 == null || v2 == null) {
            return;
        }
        // Add our edges
        for (Vertex v : vertices) {
            if (v == v1) {
                v.addNeighbour(v2);
            }
            if (v == v2) {
                v.addNeighbour(v1);
            }
        }
    }

    // Helper Methods

    /**
     * Method find vertex
     * finds vertices in arrary
     * 
     * @param ver
     * @return
     */
    public boolean findVertex(Vertex ver) {
        for (Vertex v : vertices) {
            if (v == ver) {
                return true;
            }
        }
        return false;
    }

    /**
     * getVertex Method to get Vertecies
     * 
     * @param s
     * @return
     */
    public Vertex getVertex(String s) {
        for (Vertex v : vertices) {
            if (v.toString().equals(s)) {
                return v;
            }
        }
        return null;
    }

    public void print() {
        for (Vertex v : vertices) {
            System.out.println(v.toString() + " " + v.getNeighbours().toString());
        }
    }
}
