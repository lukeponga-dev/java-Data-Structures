public class Main {
    public static void main(String[] args) {

        System.out.println("\nGRAPH!");

        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("A");

        System.out.println("\nGraph:");
        graph.print();
        System.out.println("\nGraph:");

        graph.addEdges("B", "C");
        graph.addEdges("B", "A");
        graph.addEdges("A", "D");

        graph.print();
        System.out.println("\nGraph:");

        graph.removeEdge("B", "C");
        graph.print();
        System.out.println("\nGraph:");
        graph.removeVertex("B");
        graph.print();
    }
}
