package P7;

public class ListMKLatihan {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();
        
        list.addHead(new Matakuliah("IF001", "Dasar Pemerograman", 4));
        list.addHead(new Matakuliah("IF002", "Pemerograman Web", 3));

        list.displayElement();
    }
}
