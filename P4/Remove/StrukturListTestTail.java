package P4.Remove;

public class StrukturListTestTail {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(2);
        list.addTail(6);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);


        System.out.println("List elemen diawal: ");
        list.displayElement();

        list.removeTail();

        System.out.println("\nList elemen setelah dihapus diakhir: ");
        list.displayElement();

        list.removeHead();

        System.out.println("\nList elemen setelah dihapus diawal: ");
        list.displayElement();

        list.removeTail();

        System.out.println("\nList elemen setelah dihapus diakhir: ");
        list.displayElement();
        
    }
}
