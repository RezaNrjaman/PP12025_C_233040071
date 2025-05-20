public class Main {
    public static void main(String[] args) {
        StrukturStack s = new StrukturStack(5);
        System.out.println("#Sebelum push");
        System.out.println("Size: " + s.size());
        System.out.println("Empty: " + s.isEmpty());
        System.out.println("Full: " + s.isFull());
        System.out.println("Top: " + s.top());
        System.out.println("Elemen from TOP: ");
        s.display();

        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println();
        System.out.println("#Melakukan push 3x: ");
        System.out.println("push 2; push 4, push 1");
        System.out.println("Size: " + s.size());
        System.out.println("Empty: " + s.isEmpty());
        System.out.println("Full: " + s.isFull());
        System.out.println("Top: " + s.top());
        System.out.print("Elemen from TOP: ");
        s.display();
        System.out.println("\n");

    }
}