package PP12025_C_233040071.P4.Tugas;

public class Node {
    private double data;
    private Node next;

    // inisialisasi Node
    public Node(Double data) {
        this.data = data;
    }

    // Setter $ Getter

    public void setNext(Node next) {
        this.next = next;
    } 

    public Node getNext () {
        return next;
    }

    public void setNilai(Double data) {
        this.data = data;
    }

    public Double getData() {
        return data;
    } 
}
