public class StrukturStack {
    private int[] array;
    private int capacity;
    private int TOP;

    public final int MIN = -1;

    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    public boolean isEmpty() {
        return (TOP == MIN);
    }

    public boolean isFull() {
        return (TOP == capacity - 1);
    }

    public int size() {
        return TOP + 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    public int pop() {
        int temp = -1;
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            temp = array[TOP];
            TOP = TOP - 1;
        }
        return temp;
    }

    public int top() {
        if (TOP == MIN) {
            return -1;
        } else {
            return array[TOP];
        }
    }

    public void display() {
        if (!isEmpty()) {
            for (int i = TOP; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.print("Stack kosong");
        }
    }

}
