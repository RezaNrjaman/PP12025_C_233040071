package P4.Tugas;

public class TugasMainB {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(4.5);
        list.addTail(5.5);
        list.addHead(3.4);
        list.addMid(2.1,2);
        list.addMid(1.1,3);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}
