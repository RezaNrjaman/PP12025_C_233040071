package P4.Tugas;

public class TugasMainA {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(4.5);
        list.addHead(2.1);
        list.addMid(3.4,2);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}
