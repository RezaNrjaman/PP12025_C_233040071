package P11;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        //menambahkan vertex
        graph.addVertex('A'); // 0 (START FOR DFS)
        graph.addVertex('B'); // 1
        graph.addVertex('C'); // 2
        graph.addVertex('D'); // 3
        graph.addVertex('E'); // 4
        //menambahkan edge
        graph.addEdge(0, 1); //AB
        graph.addEdge(1, 2); //BC
        graph.addEdge(0, 3); //AD
        graph.addEdge(3, 4); //DE
        graph.adjacencyMatrix();
        System.out.println();
    }
}
