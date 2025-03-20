package P6;

public class StrukturListTest1 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(5);
        list.addTail(4);
        list.addTail(6);
        
        list.displayElement();

        System.out.println("\n" + list.find(6));
    }
}
