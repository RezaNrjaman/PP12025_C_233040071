public class Tugas9 {
    public static void main(String[] args) {
        StrukturStack s = new StrukturStack(5);
        // Tugas
        s.pop();
        System.out.println("#Sebelum push");
        System.out.println("Size: " + s.size());
        System.out.println("Empty: " + s.isEmpty());
        System.out.println("Full: " + s.isFull());
        System.out.println("Top: " + s.top());
        System.out.print("Elemen from TOP: ");
        s.display();
        s.push(3);
        s.push(5);
        s.push(6);
        s.push(8);
        s.push(9);
        System.out.println();
        System.out.println("#Melakukan push 5x: ");
        System.out.println("push 3, push 5, push 6, push 8, push 9");
        System.out.println("Melakukan push 7 ");
        s.push(7);

        System.out.println("Size: " + s.size());
        System.out.println("Empty: " + s.isEmpty());
        System.out.println("Full: " + s.isFull());
        System.out.println("Top: " + s.top());
        System.out.print("Elemen from TOP: ");
        s.display();
        System.out.println();
        System.out.println("#Melakukan pop 3x");
        s.pop();
        s.pop();
        s.pop();
        System.out.println("Size: " + s.size());
        System.out.println("Empty: " + s.isEmpty());
        System.out.println("Full: " + s.isFull());
        System.out.println("Top: " + s.top());
        System.out.print("Elemen from TOP: ");
        s.display();
    }
}

