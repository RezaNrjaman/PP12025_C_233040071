package P7;

import java.util.Scanner;

public class ListMKTestLatihan6 {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();
        Scanner input = new Scanner(System.in);
        int menu = 0;

        list.addTail(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.addMid(new Matakuliah("IF003", "Pemerograman Web", 3), 3);
        list.addMid(new Matakuliah("IF002", "Striktur Diskrit", 3), 2);
        list.addTail(new Matakuliah("IF001", "Dasar Pemerograman", 4));
        list.addHead(new Matakuliah("IF005", "PBO", 3));
        list.addHead(new Matakuliah("IF006", "SBO", 3));


        while (menu != 99) {
            list.menu();
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine(); // membersihkan newline

            switch (menu) {
                case 1:
                    list.addHead(buatMatakuliah(input));
                    break;
                case 2:
                    list.addTail(buatMatakuliah(input));
                    break;
                case 3:
                    Matakuliah mkMid = buatMatakuliah(input);
                    System.out.print("Masukkan posisi (dimulai dari 1): ");
                    int posisi = input.nextInt();
                    input.nextLine();
                    list.addMid(mkMid, posisi);
                    break;
                case 4:
                    list.removeHead();
                    break;
                case 5:
                    list.removeTail();
                    break;
                case 6:
                    System.out.print("Masukkan kode matakuliah yang ingin dihapus: ");
                    String kodeHapus = input.nextLine();
                    list.removeMid(kodeHapus);
                    break;
                case 7:
                    System.out.print("Masukkan kode matakuliah yang dicari: ");
                    String kodeCari = input.nextLine();
                    if (list.find(kodeCari)) {
                        System.out.println("Matakuliah ditemukan!");
                    } else {
                        System.out.println("Matakuliah tidak ditemukan.");
                    }
                    break;
                case 8:
                    System.out.println("Jumlah matakuliah: " + list.count());
                    break;
                case 9:
                    System.out.println("\n--- Daftar Seluruh Matakuliah ---");
                    list.displayElement();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        }

        input.close();
    }

    // Helper method untuk membuat objek Matakuliah
    public static Matakuliah buatMatakuliah(Scanner input) {
        System.out.print("Masukkan kode matakuliah: ");
        String kode = input.nextLine();
        System.out.print("Masukkan nama matakuliah: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jumlah sks: ");
        int sks = input.nextInt();
        input.nextLine(); // clear newline
        return new Matakuliah(kode, nama, sks);
    }
}

