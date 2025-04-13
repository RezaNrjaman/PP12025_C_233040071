package P7;

import java.util.Scanner;

public class ListMKTestLatihan6 {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();

        list.addTail(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.addMid(new Matakuliah("IF003", "Pemerograman Web", 3), 3);
        list.addMid(new Matakuliah("IF002", "Striktur Diskrit", 3), 2);
        list.addTail(new Matakuliah("IF001", "Dasar Pemerograman", 4));
        list.addHead(new Matakuliah("IF005", "PBO", 3));
        list.addHead(new Matakuliah("IF006", "SBO", 3));

        list.displayElement();
        System.out.println("Jumlah Matakuliah: " + list.count());
    }
}

