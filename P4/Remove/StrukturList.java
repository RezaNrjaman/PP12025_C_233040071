package P4.Remove;

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

    public void addMid(int data, int position) {
        Node posNode=null, curNode=null;
        int i;

        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            curNode = HEAD;
            if (position == 1) {
                newNode.setNext(curNode);
                HEAD = newNode;
            }
            else {
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                    posNode.setNext(newNode);
                    newNode.setNext(curNode);
            }
        }
    }

    public void dispose(Node node) {
        node.setNext(null);
        node = null;
    }

    public void removeHead() {
        if(isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    public void removeTail() {
        if(isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node lastNode = HEAD;
            Node preNode = null;

            while (lastNode.getNext() != null) {
                preNode = lastNode;
                lastNode = lastNode.getNext();
            }

            preNode.setNext(null);
            dispose(lastNode);
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }
}
