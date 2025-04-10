package P7;

public class ListMKTest4 {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();

        list.addTail(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.addMid(new Matakuliah("IF003", "Pemerograman Web", 3), 3);
        list.addMid(new Matakuliah("IF002", "Striktur Diskrit", 3), 2);
        list.addTail(new Matakuliah("IF001", "Dasar Pemerograman", 4));

        list.displayElement();

    }
}
