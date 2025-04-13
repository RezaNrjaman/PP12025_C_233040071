package P7;

public class ListMKTest1 {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();
        
        list.addHead(new Matakuliah("IF001", "Dasar Pemerograman", 4));
        list.addHead(new Matakuliah("IF002", "Pemerograman Web", 3));
        list.addHead(new Matakuliah("IF003", "Striktur Diskrit", 3));
        list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));

        list.displayElement();
    }
}
