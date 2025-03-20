package P6;

public class Tugas {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(1);
        list.addTail(9);
        list.addHead(4);
        list.addMid(3,2);
        list.addMid(7,3);
        list.addMid(8,4);
        
        list.displayElement();

        list.removeAll();
    }
}
