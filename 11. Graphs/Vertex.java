import java.util.ArrayList;

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
}
