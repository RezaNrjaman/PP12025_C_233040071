package P4;

public class Node {
    private int data;
    private Node next;

    // inisialisasi Node
    public Node(int data) {
        this.data = data;
    }

    // Setter $ Getter

    public void setNext(Node next) {
        this.next = next;
    } 

    public Node getNext () {
        return next;
    }

    public void setNilai(int data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    } 
}
