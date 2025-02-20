package PP12025_C_233040071.P3;

public class StrukturList {

    Node HEAD;

    public boolean isEmpty() {
        if(HEAD != null){
            return false;
        }
        else {
            return true;
        }
    }

    public void addTail(int data) {
        Node posNode=null, curNode=null;

        Node newNode = new Node(data);
        if (isEmpty())
        {
            HEAD = newNode;
        }
        else
        {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.println(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }
}
