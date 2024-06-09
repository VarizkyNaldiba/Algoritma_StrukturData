public class GraphMain28 {
    public static void main(String[] args) throws Exception {
        Graph28 gedung = new Graph28(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 40);
        gedung.addEdge(1, 2, 30);
        gedung.addEdge(1, 3, 15);
        gedung.addEdge(1, 4, 25);
        gedung.addEdge(2, 4, 20);
        gedung.addEdge(3, 4, 10);
        gedung.addEdge(3, 5, 15);
        gedung.addEdge(4, 5, 5);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();
    }
}

