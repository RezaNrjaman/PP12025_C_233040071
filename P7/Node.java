package P7;

public class Node {
    private Matakuliah data;
    private Node next;

    // inisialisasi Node
    public Node(Matakuliah data) {
        this.data = data;
    }

    // Setter $ Getter

    public void setNext(Node next) {
        this.next = next;
    } 

    public Node getNext () {
        return next;
    }

    public void setData(Matakuliah data) {
        this.data = data;
    }

    public Matakuliah getData() {
        return data;
    } 
}   
