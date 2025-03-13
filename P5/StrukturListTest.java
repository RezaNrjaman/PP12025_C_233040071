package PP12025_C_233040071.P5;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(5);
        list.addTail(1);
        list.addHead(2);
        list.addMid(6,2);
        list.addMid(3,3);


        System.out.println("List elemen diawal: ");
        list.displayElement();

        list.removeMid(3);

        System.out.println("\nList elemen setelah Remove(3): ");
        list.displayElement();

        list.removeMid(6);

        System.out.println("\nList elemen setelah Remove(6): ");
        list.displayElement();

        list.removeMid(5);

        System.out.println("\nList elemen setelah Remove(5): ");
        list.displayElement();
    }
}
