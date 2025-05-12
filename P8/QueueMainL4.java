package P8;

public class QueueMainL4 {
    public static void main(String[] args) {
        StrukturQueue q = new StrukturQueue();
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());
        System.out.println();
        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(6);
        System.out.println("### Sesudah Enqueue 3x ###");
        System.out.println("size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());
        System.out.println("Front: " + q.front());
    }
}
