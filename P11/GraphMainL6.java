package P11;

public class GraphMainL6 {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        // menambahkan vertex
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3
        // menambahkan edges
        graph.addEdge(0, 1); //AB BA
        graph.addEdge(0, 2); //AC CA
        graph.addEdge(0, 3); //AD DA
        graph.addEdge(1, 3); //BD DB
        
        graph.adjacencyMatrix();
        System.out.println();
    }
}
