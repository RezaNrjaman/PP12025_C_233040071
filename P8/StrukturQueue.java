package P8;

public class StrukturQueue {

    Node REAR;
    Node FRONT;

    public boolean isEmpty() {
        if(FRONT != null){
            return false;
        }
        else {
            return true;
        }
    }

    public void dispose(Node node) {
        node.setNext(null);
        node = null;
    }


    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;

        }
        else {
            REAR.setNext (newNode);
            REAR =newNode;
        }
    }

    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }
    
    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }

    public int dequeue() {
        Node temp;
        int dequeue = -1;
        if(FRONT != null) {
            dequeue = FRONT.getData();
            if(FRONT == REAR) {
                FRONT = null;
                REAR = null;
            }
            else {
                temp = FRONT;
                FRONT = FRONT.getNext();
                dispose(temp);
            }
        }
        return dequeue;
    }

    public void displayElement() {
        Node curNode = FRONT;
        
        if (curNode != null) {
            while (curNode != null) {
                System.out.print(curNode.getData()+ " ");
                curNode = curNode.getNext();
            }
        }
        else {
            System.out.println("Queue kosong");
        }
    }
}
