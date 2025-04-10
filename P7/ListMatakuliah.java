package P7;

public class ListMatakuliah {
    Node HEAD;

    public boolean isEmpty() {
        if(HEAD != null){
            return false;
        }
        else {
            return true;
        }
    }

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addTail(Matakuliah data) {
        Node posNode=null, curNode=null;

        Node newNode = new Node(data);
        if (isEmpty())
        {
            HEAD = newNode;
        }
        else
        {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void addMid(Matakuliah data, int position) {
        Node posNode=null, curNode=null;
        int i;

        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            curNode = HEAD;
            if (position == 1) {
                newNode.setNext(curNode);
                HEAD = newNode;
            }
            else {
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                    posNode.setNext(newNode);
                    newNode.setNext(curNode);
            }
        }
    }

    public int count() {
        Node curNode = HEAD;
        int jumlah = 0;

        while (curNode != null) {
            jumlah = jumlah + 1;
            curNode = curNode.getNext();
        }
        return jumlah;
    }

    public void dispose(Node node) {
        node.setNext(null);
        node = null;
    }

    public void removeHead() {
        if(isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    public void removeTail() {
        if(isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node lastNode = HEAD;
            Node preNode = null;

            while (lastNode.getNext() != null) {
                preNode = lastNode;
                lastNode = lastNode.getNext();
            }

            preNode.setNext(null);
            dispose(lastNode);
        }
    }

    public void removeMid(String kode) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
    
        Node tempNode = HEAD;
        Node preNode = null;
    
        while (tempNode != null) {
            if (tempNode.getData().getKode().equals(kode)) {
                if (preNode == null) {
                    // Data berada di head
                    HEAD = tempNode.getNext();
                } else {
                    // Data berada di tengah/akhir
                    preNode.setNext(tempNode.getNext());
                }
                dispose(tempNode);
                System.out.println("Matakuliah dengan kode " + kode + " berhasil dihapus.");
                return;
            }
            preNode = tempNode;
            tempNode = tempNode.getNext();
        }
    
        System.out.println("Matakuliah dengan kode " + kode + " tidak ditemukan.");
    }
    
    

    public boolean find(String kode) {
        Node curNode = HEAD;
        while (curNode != null) {
            if (curNode.getData().getKode().equals(kode)) {
                return true;
            }
            curNode = curNode.getNext();
        }
        return false;
    }

    public void menu() {
        System.out.println("\n======= MENU =======");
            System.out.println("1. Tambah List di Awal");
            System.out.println("2. Tambah List di Akhir");
            System.out.println("3. Tambah List di Tengah");
            System.out.println("4. Hapus List di Awal");
            System.out.println("5. Hapus List di Akhir");
            System.out.println("6. Hapus List di Tengah");
            System.out.println("7. Cari Matakuliah");
            System.out.println("8. Hitung Jumlah Matakuliah");
            System.out.println("9. Lihat Semua Matakuliah");
    }
    

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println(curNode.getData().getKode()+ " " +curNode.getData().getNama()+ " " +curNode.getData().getSks());
                curNode = curNode.getNext();
            }
        }
        System.out.println();
    }
}
