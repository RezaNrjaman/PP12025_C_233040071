package PP12025_C_233040071.P3;

public class ListMain {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}
