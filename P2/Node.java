package PP12025_C_233040071.P1;

public class Node {

    private int nilai;
    private Node next;

    // inisialisasi Node
    public Node(int nilai) {
        this.nilai = nilai;
    }

    // Setter $ Getter

    public void setNext(Node next) {
        this.next = next;
    } 

    public Node getNext () {
        return next;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public Integer getNilai() {
        return nilai;
    } 
        
}
