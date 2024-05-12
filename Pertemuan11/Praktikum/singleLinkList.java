package Praktikum;
public class singleLinkList {

    node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            node tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list Kosong");
        }
    }

    void addFirst(int input) {
        node ndInput = new node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        node ndInput = new node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;

        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        node ndInput = new node(input, null);
        node tmp = head;
        while (tmp != null) {
            if (tmp.data == key) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            tmp = tmp.next;
        }
    }

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Index tidak valid!");
            return;
        }
        if (index == 0) {
            addFirst(input);
            return;
        }
        node ndInput = new node(input, null);
        node tmp = head;
        for (int i = 0; i < index - 1 && tmp != null; i++) {
            tmp = tmp.next;
        }
        if (tmp == null) {
            System.out.println("Index melebihi ukuran linked list!");
        } else {
            ndInput.next = tmp.next;
            tmp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }

    int getData(int index) {
        node tmp = head;
        for (int i = 0; i < index && tmp != null; i++) {
            tmp = tmp.next;
        }
        if (tmp == null) {
            System.out.println("Index melebihi ukuran linked list!");
            return -1;
        } else {
            return tmp.data;
        }
    }

    int indexOf(int key) {
        node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if(isEmpty()) {
            System.out.println(" Linked List Masih Kosong" + " tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if(isEmpty()) {
            System.out.println(" Linked List Masih Kosong" + " tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            node tmp = head;
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    } 

    void remove(int key) {
        if (isEmpty()) {
            System.out.println(" Linked List Masih Kosong" + " tidak dapat dihapus");
        } else {
            node tmp = head;
            while (tmp != null) {
                if (tmp.data == key && tmp == head ) {
                    removeFirst();
                    break;
                } else if (tmp.next != null && tmp.next.data == key ) {
                    tmp.next = tmp.next.next;
                    if(tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            node tmp = head;
            for (int i = 0; i < index - 1 && tmp != null; i++) {
                tmp = tmp.next;
            }
            if (tmp == null) {
                System.out.println("Index melebihi ukuran linked list!");
            } else {
                tmp.next = tmp.next.next;
                if (tmp.next == null) {
                    tail = tmp;
                }
            }
        }
    }
}


