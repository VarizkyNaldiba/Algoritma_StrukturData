public class StackKonversi28 {
    int size, top, tumpukkanBiner[];
    
    public StackKonversi28() {
        this.size = 32;
        tumpukkanBiner =  new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push (int data) {
        if (isFull()) {
            System.out.println("Stack Penuh");
        } else {
            top++;
            tumpukkanBiner[top] = data;
        }
    }

    public int pop () {
        if (isEmpty()) {
            System.out.println("Stack Kosong");
            return -1;

        } else {
            int data = tumpukkanBiner[top];
            top--;
            return data;
        }
    }
}

