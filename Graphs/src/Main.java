public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 10);
        graph.addEdge(1, 2, 10);
        graph.addEdge(2, 0, 10);
        graph.addEdge(2, 3, 10);
        graph.addEdge(3, 3, 10);

        graph.DFS(2);
    }
}
