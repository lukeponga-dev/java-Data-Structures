import java.util.ArrayList;
import javax.swing.text.Document;;

public class Graph {
    // Constructors
    ArrayList<Vertex> vertices;

    public Graph() {
        vertices = new ArrayList<Vertex>();
    }

    public boolean findVertex(Vertex ver) {
        for (Vertex v : vertices) {
            if (v == ver) {
                return true;
            }
        }
        return false;
    }

    public Vertex getVertex(String s) {
        for(Vertex v : vertices){
            for(v.toString().equals(s)){
                return v;
            }
        }
        return null;
    }
}
