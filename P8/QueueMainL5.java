package P8;

public class QueueMainL5 {
    public static void main(String[] args) {
        StrukturQueue q = new StrukturQueue();
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());
        System.out.print("Elemen Queue: ");
        q.displayElement();
        System.out.println();
        q.enqueue(2);
        q.enqueue(7);
        q.enqueue(6);
        q.enqueue(1);
        System.out.println("### Sesudah Enqueue 4x ###");
        System.out.println("size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());
        System.out.print("Elemen Queue: ");
        q.displayElement();
        System.out.println();
        System.out.println("Front: " + q.front());
    }
}
