package P6;

public class StrukturListTest2 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(2);
        list.addTail(3);
        list.addHead(7);
        list.addMid(6,2);
        list.addMid(4,3);
        
        list.displayElement();

        System.out.println("\n" + list.size());
    }
}
