package PP12025_C_233040071.P4.Remove;

public class StrukturListTestHead {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addHead(2);
        list.addHead(9);
        list.addHead(7);


        System.out.println("List elemen diawal: ");
        list.displayElement();

        list.removeHead();

        System.out.println("\nList elemen setelah dihapus 1x: ");
        list.displayElement();

        list.removeHead();

        System.out.println("\nList elemen setelah dihapus 2x: ");
        list.displayElement();

        list.removeHead();

        System.out.println("\nList elemen setelah dihapus 3x: ");
        list.displayElement();
        
    }
}
